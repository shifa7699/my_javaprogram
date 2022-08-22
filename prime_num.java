package program.com;

import java.util.Scanner;
public class prime_num 
{
	public static void main(String args[]){
		int n,i,f=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(i=2;i<n;i++)
        {
        	if(n%i==0)
        	{
        		System.out.println("It is not a prime number");
        		f=1;
        		break;
        	}
        }
        if(f==0)
        {
        	System.out.println("It is a prime number");
        }
	}
}
