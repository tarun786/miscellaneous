package miscellaneous.com.concept1;

import miscellaneous.com.os.OS;
import miscellaneous.com.os.OpratingSystemFactory;

public class DesignFactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     OpratingSystemFactory obj=new OpratingSystemFactory();
     OS andr = obj.getInstance("IOS");
     andr.spec();
     //System.out.println(andr);
	}

}
