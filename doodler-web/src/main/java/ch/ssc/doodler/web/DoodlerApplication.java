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

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import ch.ssc.doodler.generated.OptionsType.Option;
import ch.ssc.doodler.generated.PollType;
import ch.ssc.doodler.service.DoodleRESTClient;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
@SessionScoped
public class DoodlerApplication extends Application {

	private CustomLayout layout;

	@Override
	public void init() {
		layout = new CustomLayout("application-layout");

		Label head = new Label("SwissSoftwareCircle - doodler");
		Label info = new Label("Information about doodler is placed here!");
		DoodleDialog doodleDialog = new DoodleDialog();		
		HorizontalSplitPanel businessData = new HorizontalSplitPanel();
		businessData.setSplitPosition(50);
		businessData.setSizeFull();
		businessData.addComponent(doodleDialog);

		layout.addComponent(head, "head");
		layout.addComponent(info, "info");
		layout.addComponent(businessData, "business-data");
		
		setTheme("ssc");
		setMainWindow(new Window("El doodolero", layout));

	}

}
