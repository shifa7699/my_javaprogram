package program.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class read_write 
{
	public static void main(String ags[]) throws IOException 
  {
		FileInputStream fil_1=new FileInputStream("read_1.txt");
		FileInputStream fil_2=new FileInputStream("read_2.txt");
		SequenceInputStream is=new SequenceInputStream(fil_1,fil_2);
		FileOutputStream fout=new FileOutputStream("write.txt");
		int i;
		while((i=is.read())!=-1) 
    {			
			fout.write((char)i);
		}
    fout.close();
	}
}
//WAP to read the data from two files and write it into another file.
