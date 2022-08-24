package program.com;

import java.util.Scanner;
public class pattern_1 
{
	public static void main(String ags[])
    {
        int i,j,rows,k=1;
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        System.out.println("Enter the number of rows: ");
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("\t"+k++);
            }
            System.out.println();
        }
    }
}
