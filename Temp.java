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
		System.out.print(e.getMessage())
	}
}
/*Create two user-defined exceptions named “TooHot” and “TooCold” to check the
temperature (in Celsius) given by the user passed  is too hot or too cold.
If temperature > 35, throw exception “TooHot”.
 If temperature <5, throw exception “TooCold”.
Otherwise, print “Normal” and convert it to Farenheit.*/
