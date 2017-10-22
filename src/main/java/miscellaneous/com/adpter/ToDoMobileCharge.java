package miscellaneous.com.adpter;

public class ToDoMobileCharge {

	private Charger charger;

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	public void doCharge(String mobileName)
	{
		charger.mobileCharger(mobileName);
	}
	
}
