/**
 * @author tjaiswal
 * Factory design pattern is used when we have a super class with multiple sub-classes and based on input, 
 * we need to return one of the sub-class. 
 * This pattern take out the responsibility of instantiation of a class from client program to the factory class.
 */

package miscellaneous.com.concept1;

import miscellaneous.com.os.Blackberry;
import miscellaneous.com.os.OS;
import miscellaneous.com.os.OpratingSystemFactory;

public class DesignFactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     OpratingSystemFactory obj=new OpratingSystemFactory();
     OS andr = obj.getInstance("blackberry");  //Os andr=new IOS() so this method has created a object of IOS class
     andr.spec();
     //((B) obj).print();
    
    
     System.out.println(((Blackberry)andr).ddRam()); //downcasting
	}

}
