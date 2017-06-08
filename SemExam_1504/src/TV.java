
public class TV implements Device {

	boolean state = false;
	int channel = 50;
	
	@Override
	public void setState(boolean state) {
		// TODO Auto-generated method stub
		this.state = state;
		if (this.state)
			System.out.println("TV Is turned on");
		else
			System.out.println("TV Is turned off");
	}

	@Override
	public void getState() {
		// TODO Auto-generated method stub
		if (this.state)
			System.out.println("TV Is turned on");
		else
			System.out.println("TV Is turned off");
	}
	
	public void getChannel()
	{
		System.out.println("Channel no: "+channel);
	}
	
	public void channelUp()
	{
		channel++;
		System.out.println("Channel no: "+channel);
	}
	
	public void channelDown()
	{
		channel--;
		System.out.println("Channel no: "+channel);
	}
}
