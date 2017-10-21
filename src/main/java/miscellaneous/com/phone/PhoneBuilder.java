/**
 * Builder Design patterns
 * 
 * NOTE:
 * Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns 
 * when the Object contains a lot of attributes.
 */

package miscellaneous.com.phone;

public class PhoneBuilder {

	private String os;
	private String processor;
	private int ram;
	private int battery;
	private double screenSize;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
		
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
		
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
		
	}
	
	public Phone getPhone()
	{
		return new Phone(os, processor, ram, battery, screenSize);
	}
	
}
