package program.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class letter_search 
{
	public static void main(String args[]) throws IOException 
  {
		FileInputStream fin=new FileInputStream("test.txt");
	  int i,c=0;
		while((i=fin.read())!=-1 ) 
    {
      if(i!=' ')
			c++;
		}
		System.out.print("The number of letters in the file is "+c);
		fin.close();
	}
}
////WAP to count the number of letters in a file.
