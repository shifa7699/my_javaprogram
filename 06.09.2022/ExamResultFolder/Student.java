package program.com;


public class Student 
{
    String name;
    int rollno;
    double marks1,marks2;
    Student(String n, int roll_no, double m1, double m2)
    {
	name=n;
	rollno=roll_no;
	marks1=m1;
	marks2=m2;
}
void show() 
{
	System.out.println("Student name: "+name);
	System.out.println("Roll_no: "+rollno);
	System.out.println("Student name: "+marks1);
	System.out.println("Student name: "+marks2);
		
}
public static void main (String[] args)
    {
     Result r = new Result("Stud",77,80,69);
     r.Percent_cal();
     r.display();
    }
}


}
