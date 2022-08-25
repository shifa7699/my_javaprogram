package program.com;

import java.util.Scanner;
public class num_pattern 
{
	public static void main(String args[])
	    {
	       int rows,i,j;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number of rows: ");
	       rows=sc.nextInt();
	       for(i=1;i<=rows;i++)
	       {
	           for(j=1;j<=i;j++)
	           {
	               System.out.print("\t"+j);
	           }
	           System.out.println();
	       }
	    }
	}
/*Write a program in java to make such a pattern
*like right angle triangle with number increased
*by 1.The pattern like:
*1
*12
*123 
*1234
*12345*/
