
public abstract class Device {
	
	boolean state;
	
	public boolean getState()
	{
		return state;
	}
	
	public void turnOn ()
	{
		this.state = true;
	}
	
	public void turnOf ()
	{
		this.state = false;
	}	
}
