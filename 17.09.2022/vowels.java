package program.com;

import java.io.FileInputStream;
import java.io.IOException;

public class vowels
{
	public static void main(String[] args) throws IOException
  {
		  FileInputStream fin=new FileInputStream("java_test.txt");
		  int a=0;
		  while((i=fin.read())!=-1)
      { 
			    if(a=='a'||a=='A'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u')
				  System.out.print((char)a+" ");
				
		  }
		  fin.close();
	  }
}
//WAP to print vowels from a text file.
