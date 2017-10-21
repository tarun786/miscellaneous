package miscellaneous.com.phone;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Phone phone=new PhoneBuilder().setRam(2).setScreenSize(3.5).setOs("Android").getPhone();
	System.out.println(phone);
		
	}

}
