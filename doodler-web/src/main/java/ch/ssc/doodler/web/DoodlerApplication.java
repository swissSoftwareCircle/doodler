/*
 * Copyright 2009 IT Mill Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ch.ssc.doodler.web;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import ch.ssc.doodler.generated.OptionsType.Option;
import ch.ssc.doodler.generated.PollType;
import ch.ssc.doodler.service.DoodleRESTClient;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
@SessionScoped
public class DoodlerApplication extends Application
{
    private Window window;
    private PollType pt;
    @Inject
    private DoodleRESTClient client;
    
    @Override
    public void init()
    {
        window = new Window("My Vaadin Application");
        setMainWindow(window);
        final TextField doodleUrl = new TextField("doodle url");
        Button button = new Button("Click Me");
        
        button.addListener(new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                window.addComponent(new Label("Thank you for clicking"));
                pt = client.getPoll((String)doodleUrl.getValue());
                VerticalLayout vl = new VerticalLayout();
                Label l = new Label("Options");
                Label doodleSubject = new Label(pt.getDescription());
                vl.addComponent(l);
                vl.addComponent(doodleSubject);
                for (Option op : pt.getOptions().getOption()) {
					vl.addComponent(new Label(op.getDateTime().toString()));
				}
                window.addComponent(vl);
            }
        });
        window.addComponent(button);
        
    }
    
}
