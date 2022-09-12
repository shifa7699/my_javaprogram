package program.com;

import java.util.Scanner;
public class even_remove
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++) 
        {
            if(i%2==0) 
            {
                continue;
            }
            else 
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}
/*write a java program to remove the characters at even 
indexes and then print the new string*/
