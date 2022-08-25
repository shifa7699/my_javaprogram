package program.com;


public class prime 
{
	public static void main(String args[])
    {
         int a=15,b=30,i,j;
         for(i=a; i<=b; i++)
         {
            for(j=2; j<=i ; j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
          if(i==j)
          {
              System.out.println(j);
          }
        }
    }
}
// Write a Java Program to print prime numbers from 15 to 30.
