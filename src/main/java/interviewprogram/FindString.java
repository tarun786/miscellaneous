package interviewprogram;

public class FindString {
    public static void main(String args[]) {
    String st="abc,def,ghi,jkl";
    int count=0;
    
    int index=0;
    String s1="";
    loop1:
    for(char ch:st.toCharArray())
    {  index++;
        if(ch==',')
        {
            count++;
            if(count==2)
            {
                for(int i=index;i<st.length();i++)
                {    
                    char ch1=st.charAt(i);
                    if(ch1 != ',')
                    s1=s1+ch1;
                    if(ch1==',')
                    {
                        count++;
                    }
                    if(count==3)
                    {
                        break loop1;
                    }
                }
            }
            
        }
        
    }
    System.out.println(s1);
    
    
  
    }
}
