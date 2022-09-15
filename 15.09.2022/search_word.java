package program.com;


import java.util.Scanner;
public class search_word
{
    public static void main(String args[]) 
    {
        int f=0,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("Enter the word to be searched ");
        String word=sc.next();
        String a[]=s.split(" ");
        for( i=0;i<a.length;i++) 
        {
           if(a[i].equals(word))
           {
              f=1;
              break;
            }
        }
        if(f==1) 
        {
            System.out.println("The word is Found");
        }
        else 
        {
            System.out.println("The word is not found ");
        }
    }
}
//Write a Java Program to Search a Particular Word in a String.without any method
