package program.com;

import java.util.*;
public class square_sum
{
	 public static void main()
	    {
	        int n1,n2,sum,num;;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the first number"); 
	        n1=sc.nextInt();
	        System.out.println("Enter the second number"); 
	        n2=sc.nextInt();
	        System.out.println("Enter the positive number");
	        num=sc.nextInt();
	        sum=n1*n1+n2*n2;
	        if(sum==num)
	        {
	            System.out.println("Equal");
	        }
	        else
	        {
	            System.out.println("Not Equal");
	        }
	    }
 }
/*Write a java program to test whether there are two 
 * integers x and y such that x^2+y^2 is equal to a 
 * given positive number.*/
	 

}
