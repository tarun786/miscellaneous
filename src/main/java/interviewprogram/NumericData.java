package interviewprogram;

public class NumericData {

	public void getNumericdata(String str)
	{
		char[] ch = str.toCharArray();
		System.out.println(ch.length);
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			char ch_val = ch[i];
			int ch_to_assci=(int)ch_val;
			if(ch_to_assci>=48 && ch_to_assci<=57)
			{
				str1=str1+ch_val;
			}
			
		}
		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumericData num=new NumericData();
		num.getNumericdata("ABC12345");
		
		
	}

}
