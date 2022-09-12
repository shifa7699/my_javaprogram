package program.com;


import java.util.Scanner;
public class Password
{
    public static void main(String args[])throws AuthenticationFailureException
    {
         String p="pass123";
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the password");
         String s=sc.next();
        try
        {            
            if(s.equals(p))
            {
            System.out.println("Welcome");
        }
        else
        {
            throw new AuthenticationFailureException("Incorrect Password");
        }
    }
    catch(AuthenticationFailureException e)
    {
        System.out.println(e.getMessage());
    }
}
/*Write a program to accept a password from the user and throw 'Authentication
Failure' exception if the password is incorrect.*/
