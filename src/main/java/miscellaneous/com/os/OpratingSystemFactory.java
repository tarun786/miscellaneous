package miscellaneous.com.os;

public class OpratingSystemFactory {

	public OS getInstance(String osName)
	{
		if(osName.equals("Android"))
		{
			return new Android();
		}
		else if(osName.equals("IOS"))
		{
			return new IOS();
		}
		else if(osName.equals("blackberry"))
		{
			return new Blackberry();
		}
		else
		{
			return new WindowOs();
		}
		
	}
	
}
