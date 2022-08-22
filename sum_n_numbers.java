package program.com;

import java.util.Scanner;
public class sum_n_numbers 
{
	public static void main(String args[])
	{
		int n,i,s=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
        	s=s+n;
        }
        System.out.println("Sum is: "+s);
	}
}
