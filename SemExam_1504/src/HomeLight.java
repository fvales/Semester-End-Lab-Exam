
public class HomeLight implements Device {

	boolean state = false;
	
	@Override
	public void setState(boolean state) {
		// TODO Auto-generated method stub
		this.state = state;
		if (this.state)
			System.out.println("HomeLight Is turned on");
		else
			System.out.println("HomeLight Is turned off");
	}

	@Override
	public void getState() {
		// TODO Auto-generated method stub
		if (this.state)
			System.out.println("HomeLight Is turned on");
		else
			System.out.println("HomeLight Is turned off");
	}

}