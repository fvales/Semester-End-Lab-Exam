
public class TV extends Device {

	int channel = 50;
	
	public int getChannel()
	{
		return channel;
	}
	
	public void channelUp()
	{
		channel++;
	}
	
	public void channelDown()
	{
		channel--;
	}
}
