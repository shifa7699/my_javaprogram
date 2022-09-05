package program.com;


public class Temp 
{
	static void checktemp(double temp)throws TooHot,TooCold 
	{
		if(temp>35)
		{
			throw new TooHot("Too Hot temperataure");
		}
		else if(temp<5)
		{
			throw new TooCold("Too Cold temperature");
		}
		else 
		{
			System.out.println("Normal");
			double farenhite=(temp*9/5)+32;
			System.out.println("\nTemperature in Farenhite="+farenhite+"F");
		}
	}
public static void main(String args[]) 
{
	try 
	{
		Temp.checktemp(10);
	}
	catch (TooHot e) 
	{
		System.out.print(e.getMessage());
	} 
	catch (TooCold e) 
	{
		System.out.print(e.getMessage());
	}
}

