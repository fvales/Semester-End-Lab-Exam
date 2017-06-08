
public class HAS {

	/*Singleton Design Pattern*/
	private static final HAS HomeAutoSys = new HAS();

    private HAS() {}

    public static HAS getInstance() 
    {
        return HomeAutoSys; 
    }
    
    
	// use getDevice method to get object of type Device
	public Device getDevice(String DeviceType) {
		if (DeviceType == null) {
			return null;
		}
		if (DeviceType.equalsIgnoreCase("TV")) {
			return new TV();

		} else if (DeviceType.equalsIgnoreCase("HomeLight")) {
			return new HomeLight();
		}
		return null;
	}
}