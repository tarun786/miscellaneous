/**
 * Adpater Design Patterns
 * 
 * Adapter design pattern in Java, also known as the Wrapper pattern is another very useful GOF pattern, 
 * which helps to bridge the gap between two classes in Java. As per the list of Gang of Four patterns, 
 * Adapter is a structural pattern, much like Proxy, Flyweight, Facade, and Decorator pattern in Java. 
 * As the name suggest, Adapter allows two classes of a different interface to work together, 
 * without changing any code on either side. You can view Adapter pattern is a central piece of the puzzle,
 * which joins two pieces, which can not be directly joined because of different interfaces. 
 * 
 */
package miscellaneous.com.adpter;

public class MobileCharger {

	public static void main(String[] args) {
	Charger charger=new ChargeAdapter();   //adpater object
	ToDoMobileCharge todoMobile=new ToDoMobileCharge();
	
	todoMobile.setCharger(charger);  //here set adpter object  
    todoMobile.doCharge("Your mobile samsung  has supported by adpter");	//access by help of adapter	

	}

}
