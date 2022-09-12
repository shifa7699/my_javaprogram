package program.com;

import java.util.Scanner;
public class String 
{
	public static void main(String args[]) throws StringMismatchException 
	{
		Scanner sc= new Scanner(System.in);
		String s="Shifa7699";
		System.out.println(s);
		System.out.print("Enter the  String same as above:");
		String u=sc.next();
		try 
		{
		if (s.equalsIgnoreCase(u)) 
		{
			System.out.println("The entered string is  equal to the given string");
		}else 
		{
			throw new  StringMismatchException("The entered string is not equal to the given string");
		}
		
	} catch ( StringMismatchException e) {
		System.out.println(e.getMessage());
	}
}
/*Write a program to throw a user-defined exception "String Mismatch Exception", if
two strings are not equal (ignore the case).*/
