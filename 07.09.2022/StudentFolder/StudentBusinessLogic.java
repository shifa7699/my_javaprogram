package program.com;


public class StudentBusinessLogic 
{
    double calpercentage(StudentDetails s1)
    {
        double percent;
        percentage=((s1.getMarks1()+s1.getMarks2()+s1.getMarks3))*100/300;
        s1.setPercentage(percentage);
        return percentage;
    
    }
}
