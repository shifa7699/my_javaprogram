package program.com;

import java.util.Scanner;
public class sales_array
{
    public static void main(String args[]) 
    {
        int i;
        double avg;
        float sum=0;
        float sales[]=new float[7];
        for(i=1;i<=7;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println ("Enter sales for day"+i+" of week = ");
            sales=sc.nextFloat();            
        }
        sum=sum+sales[i];
        //System.out.println ("Sum = "+sum);
        avg=sum/7;
        System.out.println ("Average sale of week="+avg);
    }
}
/*Write a program to accept value of apple sales for each day of 
 the week (using array oftype float) and then, calculate the 
 average sale of the week.*/