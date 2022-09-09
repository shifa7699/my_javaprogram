package program.com;

import java.util.Scanner;
public class binary_search
{
    public static void main(String args[]) 
    {
        int i,low=0,high,mid,num;
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the numbers:- ");         
            a[i]=sc.nextInt();      
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element to be searched:- ");
        num=sc.nextInt();
            high=num-1;
            mid=(low+high)/2;
            for(i=0;i<=high;i++)
            {
                if(num==a[i])
                {
                    System.out.print("Element found at "+(i+1));
                    break;
                }
                else if(num>mid)
                {
                    low=mid+1;
                    mid=(low+high)/2;
                }
                else if(num<mid)
                {
                    high=mid-1;
                    mid=(low+high)/2;
                }
                else
                System.out.print("NOT FOUND");

            }
        }
    }
