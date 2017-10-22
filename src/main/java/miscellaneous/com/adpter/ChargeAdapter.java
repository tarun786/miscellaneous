package miscellaneous.com.adpter;

import miscellaneous.com.friendCharger.FriendCharger;

public class ChargeAdapter implements Charger {
     
	
	FriendCharger fch=new FriendCharger();
	public void mobileCharger(String modelName) {
		fch.charge(modelName);
	}

}
