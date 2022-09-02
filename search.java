package program.com;


import java.util.*;
public class search
{
    public static void main(String args[])
    {
        int i,n,j,f=0;
        int a[]=new int[5];
        for(i=0;i<5;i++)
        {
            Scanner sc=new Scanner(System.in);
            a[i]=sc.nextInt();
            System.out.println("Enter the numbers:- ");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be searched:- ");
        n=sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(a[i]==n)
            {
                j=i+1;
                System.out.println("Found at index "+i+"of "+j);
                f=1;
                break;
            }
        }   
        if(f==0)
        {
               System.out.println("Not Found");
        }
     }
}
