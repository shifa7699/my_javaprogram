package program.com;

public class leap_year 
{
	public static void main(String args[])
	{
		int year=2016;
		if(year%4==0)
		{
			System.out.println(year+"is a leap year");
		}
		else
		{
			System.out.println(year+"is not a leap year");
		}
	}
}
/*Write a Java program that takes a year from user and print whether that year is a leap year or not.
Test Data
Input the year: 2016
Expected Output :
2016 is a leap year*/
