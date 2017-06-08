import static org.junit.Assert.*;

import org.junit.Test;

public class TestLight {

	@Test
	public void testOff() {
		HAS Home = HAS.getInstance(); /*Singleton, One instance of HAS*/
		Device MyLight = Home.getDevice("HomeLight");
		MyLight.turnOf();
		assertFalse (MyLight.getState());
	}
	
	@Test
	public void testOn() {
		HAS Home = HAS.getInstance(); /*Singleton, One instance of HAS*/
		Device MyLight = Home.getDevice("HomeLight");
		MyLight.turnOn();
		assertTrue (MyLight.getState());
	}

}
