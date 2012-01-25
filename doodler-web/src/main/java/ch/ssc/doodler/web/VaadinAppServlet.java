/**
 * 
 */
package ch.ssc.doodler.web;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.AbstractApplicationServlet;

/**
 * @author benjaminhaegler
 *
 */
@WebServlet(urlPatterns = "/*")
public class VaadinAppServlet extends AbstractApplicationServlet {

	@Inject
	DoodlerApplication app;

	/* (non-Javadoc)
	 * @see com.vaadin.terminal.gwt.server.AbstractApplicationServlet#getApplicationClass()
	 */
	@Override
	protected Class<? extends Application> getApplicationClass()
			throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return DoodlerApplication.class;
	}

	@Override
	protected Application getNewApplication(HttpServletRequest request)
			throws ServletException {
		// TODO Auto-generated method stub
		return app;
	}

}
