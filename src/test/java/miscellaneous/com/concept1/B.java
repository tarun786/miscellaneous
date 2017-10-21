package miscellaneous.com.concept1;

public class B implements Header{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Header obj=new B();
  ((B) obj).print();
  obj.display();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a display method");
	}

	public void print()
	{
		System.out.println("This is print method");
	}
	
}
