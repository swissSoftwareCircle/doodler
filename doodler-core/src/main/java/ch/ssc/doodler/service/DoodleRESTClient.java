/**
 * 
 */
package ch.ssc.doodler.service;

import javax.ejb.Stateless;
import javax.ws.rs.core.MediaType;

import ch.ssc.doodler.generated.PollType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 * @author benjaminhaegler
 *
 */
@Stateless
public class DoodleRESTClient {
	public static final String DOODLE_URL = "http://doodle-test.com/api1WithoutAccessControl/polls/";
	
	Client client = Client.create();
	 
	
	public PollType getPoll(String doodleId) {
		
		WebResource wr = client.resource(DOODLE_URL + doodleId);
		PollType pt = wr.accept(MediaType.APPLICATION_XML_TYPE).get(PollType.class);
		
		return pt;
	}
	
	

}
