package program.com;


public class Result extends Student implements Exam 
{
    float per_marks;
    Result(String n,int roll_no,double m1,double m2) 
     {
      super(n,roll_no,m1,m2);
     }
    public void Percent_cal() 
    {
      double total = marks1 + marks2;
      per_marks = (float)total / 2;
    }
    void display() 
    {
      show();
      System.out.println("Percentage = "+per_marks);
    } 
}