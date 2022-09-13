package program.com;


import java.util.Scanner;
public class palindrome_str
{
    public static void main(String args[])
    {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a string to check whether it is palindrome or not ");
		    String s=sc.next();
		    String p="";
		    int l=s.length()-1;
		    for(int i=0;i<s.length();i++)
		    { 
		        p+=s.charAt(l);
		        l--;
		    }
		    if(p.equals(s))		
			  System.out.println(s+" is  a palindrome");
		    else 
			  System.out.println(s+" is not a palindrome");		
    }
}
//WAP to input a string and check whether it is palindrome or not
