
public class DeviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HAS Home = HAS.getInstance(); /*Singleton, One instance of HAS*/
		
		/*Factory Design Pattern*/
		/*Asking HAS object for TV object*/
		Device MyTv1 = Home.getDevice("TV");
		
		/*Asking HAS object for AC object*/
		Device MyAc1 = Home.getDevice("AC");

		
		/*Asking HAS object for Washing Machine object*/
		Device MyWM1 = Home.getDevice("Washing Machine");
		
		/*Asking HAS object for Home Light object*/
		Device MyLight1 = Home.getDevice("HomeLight");
		
		System.out.println("Set MyTv1 On");
		MyTv1.turnOn();
		
		if (MyTv1.getState())
			System.out.println("Tv Set on");
		else
			System.out.println("Tv is Off");
		
		System.out.println("Set MyAc1 On");
		MyAc1.turnOn();
		
		if (MyAc1.getState())
			System.out.println("Ac Set on");
		else
			System.out.println("Ac is Off");
	
		System.out.println("Set Washing Machine On");
		MyWM1.turnOn();
		
		if (MyWM1.getState())
			System.out.println("Washing Machine Set on");
		else
			System.out.println("Washing Machine is Off");
		
		System.out.println("Set Washing Machine On");
		MyLight1.turnOn();
		
		if (MyLight1.getState())
			System.out.println("Light Set on");
		else
			System.out.println("Light is Off");
	}

}
