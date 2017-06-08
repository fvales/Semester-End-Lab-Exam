
public class DeviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HAS Home = HAS.getInstance(); /*Singleton, One instance of HAS*/
		
		/*Factory Design Pattern*/
		Device MyTv1 = Home.getDevice("TV");
		Device MyTv2 = Home.getDevice("TV");
		
		MyTv1.getState();
		MyTv2.getState();
		
		MyTv1.setState(true);
		MyTv2.setState(true);
		
		
		
		
	}

}
