package program.com;

import java.util.Scanner;
public class Transpose
{
    public static void main(String args[])
    {
        int i,j;
        int a[][]=new int[4][4];
        int b[][]=new int[4][4];
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the elements of first array:- ");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                  Scanner sc=new Scanner(System.in);
                  System.out.println("Enter the elements of second array:- ");
                  b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)  
            {
                System.out.println("First array elements are:- "+a[i][j]);
                b[i][j]=a[j][i];
            }
        }
        System.out.println("TRANSPOSE OF THE MATRIX IS:-");
        for(i=0;i<4;i++)
        {
            System.out.println();
            for(j=0;j<4;j++)  
            {
                System.out.print("\t"+b[i][j]);
            }
        }  
    }
}    
