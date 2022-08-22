package program.com;

import java.util.Scanner;
public class while_reverse 
{
	public static void main(String args[])
	{
		int n,d,r=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three digit number ");
        int n=sc.nextInt();
        while(n>0)
        {
        	d=n%10;
        	r=r*10+d;
        	n=n/10;
        }
        System.out.println("Reverse of the number is:- "+r);
	}

}
