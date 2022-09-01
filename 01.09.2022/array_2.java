package program.com;

import java.util.*;
public class array_2 
{
	 public static void main(String args[])
	    {
	        int i,j;
	        String arr[][]=new String[3][3];
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the arrays");
			arr=sc.nextLine();
			for(i=0;i<3;i++)
			{
		    	for(j=0;j<3;j++)
		    	{
		    		System.out.println(arr[i][j]);
		    	}
			}
	    }
}
