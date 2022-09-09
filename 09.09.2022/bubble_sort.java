package program.com;

import java.util.Scanner;
public class bubble_sort
{
    public static void main(String args[])
    {
        int i,j,f,x;
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the numbers:- ");
            a[i]=sc.nextInt();
        }
        System.out.println("The array before sorting is as follows:- ");
        for(i=0;i<10;i++)
        {
            System.out.println("\t"+a[i]);
        }
        for(i=0;i<9;i++)
        {
            f=0;
            for(j=0;j<9;j++)
            {
                if(a[j]>a[j+1])
                {
                    x=a[j];
                    a[j]=a[j+1];
                    a[j+1]=x;
                    f=1;
                    }
            }
            if(f==0)
            break;
        }
        System.out.println("The array after sorting is as follows:- ");
        for(i=0;i<10;i++)
        {
            System.out.println("\t"+a[i]);
        }
    }
}
