package program.com;

import java.util.Scanner;
public class delete_conso
{
    public static void main(String args[])
    {
       String s="Hello,have a good day";
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)=='a'|| s.charAt(i)=='A'||s.charAt(i)=='e'|| s.charAt(i)=='E'||s.charAt(i)=='i'|| s.charAt(i)=='I'||s.charAt(i)=='o'|| s.charAt(i)=='O'||s.charAt(i)=='U'|| s.charAt(i)=='u')
           {
              System.out.println(s.charAt(i));

           }
           else    
           {
                continue;
           }
       }  
    }
}

/*Write a program to delete all consonents from the string "Hello, have a good day".*/
