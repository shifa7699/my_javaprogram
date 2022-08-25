package program.com;

public class divisible 
{
	public static void main(String args[])
	{
		int num= 45;
		if(num%3==0)
		{
			if(num%5==0)
			{
				System.out.println("The number is divisible by '3' and '5' respectively");
			}
			else
			{
				System.out.println("The number is NOT divisible by '3' and '5' respectively");
			}
		}
	}
}
//Write a Java Program to check whether a number is divisibly by 5 as well as 3.
