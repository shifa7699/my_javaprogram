package program.com;

import java.util.Scanner;
public class sum_avg 
{
	public static void main(String args[])
	{
		int n,i,s=0;
		float avg;
		for(i=1;i<=5;i++)
		{
			Scanner sc=new Scanner(System.in);
	        System.out.println("enter the numbers");
	        int n=sc.nextInt();
	        s=s+n;
		}
		avg=sum/n;
		System.out.println("The sum of the numbers is: "+s);
		System.out.println("The average is: "+avg);
	}

}
