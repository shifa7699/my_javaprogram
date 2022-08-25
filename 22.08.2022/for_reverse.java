package program.com;

import java.util.Scanner;
public class for_reverse 
{
	public static void main(String args[])
	{
		int i,n,d,r=0;
		Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the three digit number ");
        	int n=sc.nextInt();
		for(i=1;i<=3;i++)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		printf("Reverse of number:- %d",r);
	}
}
//Write a java program to input a number and reverse it.
