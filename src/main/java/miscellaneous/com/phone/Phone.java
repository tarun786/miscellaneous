package miscellaneous.com.phone;

public class Phone {

	private String os;
	private String processor;
	private int ram;
	private int battery;
	private double screenSize;
	
	public Phone(String os, String processor, int ram, int battery,
			double screenSize) 
	{
		super();
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.battery = battery;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", ram=" + ram
				+ ", battery=" + battery + ", screenSize=" + screenSize + "]";
	}
	
}
