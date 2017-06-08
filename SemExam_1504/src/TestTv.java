import static org.junit.Assert.*;

import org.junit.Test;

public class TestTv {

	@Test
	public void testOff() {
		HAS Home = HAS.getInstance(); /*Singleton, One instance of HAS*/
		Device MyTv = Home.getDevice("TV");
		MyTv.turnOf();
		assertFalse (MyTv.getState());
	}
	
	@Test
	public void testOn() {
		HAS Home = HAS.getInstance(); /*Singleton, One instance of HAS*/
		Device MyTv = Home.getDevice("TV");
		MyTv.turnOn();
		assertTrue (MyTv.getState());
	}

}
