package program.com;

public class occurence
{
    public static void main(String[] args) 
    {	
        int i;
	      String str="Hello world";
	      for(i=0;i<str.length();i++) 
	      {
	         if(str.charAt(i)=='o')
	         {
		          System.out.print("First occurance="+i);
		          break;
           }
	      }
	      for(i=str.length()-1;i>=0;i--) 
	      {
		        if(str.charAt(i)=='o') 
		        {
			          System.out.print("First occurance="+i);
			          break;	
		        }
	      }
	  }
}
/*Write a program to find the first and the last occurence of the letter 'o'  
in "Hello, World".Without using any method*/
