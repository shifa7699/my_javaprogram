package pogram.com;


import java.util.*;
public class marks
{
    public static void main(String[] args)
    {
        int roll, j,s1, s2, s3;
        float avg;
        Scanner input = new Scanner(System.in);
        for(int i=0; i<8; i++)
        {
            j=i+1;
            System.out.print("Enter "+j+" roll number First subject number :");
            s1 = input.nextInt();

            System.out.print("Enter "+j+" roll number second subject number :");
            s2 = input.nextInt();

            System.out.print("Enter "+j+" roll number third subject number :");
            s3 = input.nextInt();

            avg = (s1 +s2 + s3)/3 ;
            System.out.println("Student of Roll No "+j+" gets Avarage marks of "+avg);
        }
    }
}
/*Write a program to print the roll number and average marks of 8 students in three 
 * subjects (each out of 100). The marks are entered by user.*/
 */


