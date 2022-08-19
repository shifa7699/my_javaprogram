package program.com;

public class marks {
	public static void main(String args[])
	{
		int eng=55, maths= 67, science= 73, sl= 70;
		int marks, grade;
		int marks = eng+maths+science;
		if(marks<=100 && marks<=90)
		{
			System.out.println("Grade is A+");
		}
		else if(marks>=80 && marks<90)
		{
			System.out.println("Grade is A");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("Grade is B+");
		}
		else if(marks>=60 && marks<70)
		{
			System.out.println("Grade is B");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("Grade is C");
		}
		else if(marks>=40 && marks<50)
		{
			System.out.println("Grade is D");
		}
		else if(marks>=30 && marks<40)
		{
			System.out.println("Grade is E");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
