package program.com;


public class q_equation 
{
	public static void main(String args[])
	{
		int a=1,b=5,c=1,d;
		d=b*b-4*a*c;
		if(d==0)
		{
			System.out.println("Both roots are real and the same");
		}
		else if(d>0)
		{
			System.out.println("both roots are real and different");
		}
		else
		{
			System.out.println("roots are different");
		}
	}
}
