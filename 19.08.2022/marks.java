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
/*Write a Java Program to take marks of a student and then print his/her 
grade depending on the following conditions:

90 to 100 then grade is A+, 
80 to 90  then grade is A
70 to 80 then grade is B+
60 to 70 then grade is B
50 to 60 then grade is C
40 to 50 then grade is D
30 to 40 then grade is E
less than 30 then grade is F*/
