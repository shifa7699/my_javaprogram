package program.com;


public class delete_words
{
   public static void main(String args[])
	 {
	    String s="Where there is will there is a way";
	    String words[];
	    String result="";
	    words=s.split(" ");
	    for(int i=0;i<words.length;i++) 
      {
		    for(int j=i+1;j<words.length;j++) 
        {
			     if(words[i].equals(words[j])) 
           {
				     words[j]="delete";
			    }
		    }
	    }
	    for(String w:words) 
      {
		    if(w!="delete") 
        {
			    result=result+w+" ";
		    }
	    }
      System.out.println(result);
	
	 }
}
//Write a Java Program to Delete All Repeated Words in String.
