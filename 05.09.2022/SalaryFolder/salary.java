package pogram.com;

public class salary 
{
		static void checkSal(int sal) throws InvalidSalaryException 
		{
			if(!(sal>=10000 && sal<=20000))
			{
				throw new InvalidSalaryException("Salary is invalid");
			}
			else
			{
				System.out.println("Salary is valid");
			}
		}
		public static void main(String args[])
		{
			try
			{
				salary.checkSal(12000);
			} 
			catch (InvalidSalaryException e) 
			{
				System.out.println(e.getMessage());
			}
		}
}

