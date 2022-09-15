package program.com;

public class string_sort
{
    public static void main(String args[]) 
    {

	      String sentence="Hello, have a good day";
	      String[] a=sentence.split(" ");
	      for(int i=0;i<a.length;i++)
	      {		
		        for(int j=0;j<a.length-1;j++)
		        {
			          if(a[j+1].length()>a[j].length())
                {
				            String temp=a[j+1];
				            a[j+1]=a[j];
				            a[j]=temp;
				
			          }
		        }
	      }
		    for(String i:a) 
        {
			      System.out.println(i);
		    }
	  }
}
/*WAP to input a sentence. From the sentence sort the words according to their length.
The sorting should be done is descending orderPrint the words from highest length to lowest length*/
	
