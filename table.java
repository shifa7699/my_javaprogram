package program.com;

import java.util.Scanner;
public class table 
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
        	System.out.println(n*i);
        }
	}
}
