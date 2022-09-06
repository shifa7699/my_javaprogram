package program.com;

import java.uti.Scanner;
public class Library 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
	    int f=0,books[]={101,102,103,104,105};
	    System.out.println("Enter the book no.: "); 
	    int book=sc.nextInt();
	    for(int i=0;i<books.length;i++)
	    {
	        if(books[i]==book)
	        f=1;
	    }
	    try
	    {
	    if(f==0)
	    throw new BookNotFoundException();
	    else
	    System.out.println("Book found");
	    }
	    catch(BooknotfoundException e)
	    {
	    System.out.println(e.getMessage());
	    }
	}
}
/*Consider a Library Management System, where a user wants to find a book. If the
book is present in Library (Hint: Use predefined array), then it will print the book.
Otherwise it will throw an exception “BookNotFoundException”.*/
