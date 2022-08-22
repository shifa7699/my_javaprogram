package program.com;

import java.util.Scanner;
public class armstrong 
	{
	    public static void main(String args[])
	    {
	        int i,rem,d,x,a=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the number");
	        int n=sc.nextInt();
	        x=n;
	        while(i<=10)
	        {
	            d=n%10;
	            a=a+(d*d*d);
	            n=n/10;
	        }
	        if(a==x)
	        {
	           System.out.println("It is an Armstrong number");
	        }
	        else
	        {
	        	System.out.println("NOT an armstrong number");
	        }
	    }
	}
