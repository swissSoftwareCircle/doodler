/**
 * 
 */
package ch.ssc.doodler.web;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;

import ch.ssc.doodler.generated.PollType;
import ch.ssc.doodler.generated.OptionsType.Option;
import ch.ssc.doodler.service.DoodleRESTClient;

import com.vaadin.data.Item;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.terminal.Resource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * @author benjaminhaegler
 * 
 */
@SuppressWarnings("serial")
@SessionScoped
public class DoodleDialog extends CustomLayout implements Button.ClickListener {
	
	public static final String PROPERTY_OPTION = "option";
	
	private PollType pt;
	private TextField input;
	private Table results;

	//@EJB
	private DoodleRESTClient client;

	public DoodleDialog() {
		super("doodle-dialog");
		
		client = new DoodleRESTClient();

		Label label = new Label("Provide doodle id and hit submit!");
		this.addComponent(label, "doodle-head");

		input = new TextField("doodle id");
		this.addComponent(input, "doodle-input");
		

		results = new Table();
		this.addComponent(results, "doodle-results");

		Button submit = new Button("submit", this);
		submit.setStyleName("primary"); // make it look like it's default
		// Add global shortcut using the built-in helper
		submit.setClickShortcut(KeyCode.ENTER);
		this.addComponent(submit, "doodle-buttons");
	}
	
	@Override
	public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
		getWindow().showNotification((String) input.getValue());
		pt = client.getPoll((String) input.getValue());
		results.setCaption("Options received from Doodle. Subject: " + pt.getDescription());
		
		IndexedContainer container = new IndexedContainer();
		container.addContainerProperty(PROPERTY_OPTION, String.class,
                null);
        
		int id = 0;
		for (Option op : pt.getOptions().getOption()) {
			Item item = container.addItem(id);
            item.getItemProperty(PROPERTY_OPTION).setValue(op.getDateTime().toString());
            id++;
		}
		container.sort(new Object[] { PROPERTY_OPTION },
                new boolean[] { true });
		results.setContainerDataSource(container);
	}

}
