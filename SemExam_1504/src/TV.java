
public class TV extends Device {

	int channel = 50;
	int volume = 50;
	
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
	
	public int getVolume()
	{
		return volume;
	}
	
	public void volumeUp()
	{
		volume++;
	}
	
	public void volumeDown()
	{
		volume--;
	}
}
