package program.com;

import java.util.*;
public class hcf_gcd 
{
	public static void main(String args[])
    {
        int n1,n2,i,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(i=1;i<n1;i++)
        {
            for(j=1;j<n2;j++)
            {
                x=i*(i+1);
                if(x==n1 && x==n2)
                {
                    System.out.println("GCD is",+x);
                }
                else
                {
                    System.out.println("ERROR");
                }
            }
        }
    }
}
/*Write a program to find greatest common divisor
(GCD)or highest common divisor(HCF)of two given numbers*/