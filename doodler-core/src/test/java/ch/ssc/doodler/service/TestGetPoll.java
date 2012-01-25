/**
 * 
 */
package ch.ssc.doodler.service;

import org.junit.Test;

import ch.ssc.doodler.generated.OptionsType.Option;
import ch.ssc.doodler.generated.PollType;

/**
 * @author benjaminhaegler
 *
 */
public class TestGetPoll {
	
	@Test
	public void testGetPoll() {
		DoodleRESTClient drc = new DoodleRESTClient();
		PollType pt = drc.getPoll("2253i8y7zyn3y7fu");
		
		for (Option op : pt.getOptions().getOption()) {
			System.out.println("option: " + op.getDateTime());
		}
		System.out.println("done");
	}

}
