import static org.junit.Assert.*;

import org.junit.Test;

public class TestAC {

	@Test
	public void testOff() {
		HAS Home = HAS.getInstance(); /*Singleton, One instance of HAS*/
		Device MyAc = Home.getDevice("AC");
		MyAc.turnOf();
		assertEquals (false,MyAc.getState());
	}
	
	@Test
	public void testOn() {
		HAS Home = HAS.getInstance(); /*Singleton, One instance of HAS*/
		Device MyAc = Home.getDevice("AC");
		MyAc.turnOn();
		assertTrue (MyAc.getState());
	}

}
