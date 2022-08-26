package program.com;


import java.util.*;
public class Employee_test
{
    public static void main(String args[])
    {
        Employee e1=new Employee("john","paul",12300.90);
        System.out.println("Yearly salary for first employee "+e1.YearlySal());
        System.out.println("Yearly salary after giving 10% raise "+e1.YearlySal()+0.1*e1.YearlySal());
        Employee e2=new Employee("rohan","malhotra",45000.789);
        System.out.println("Yearly salary for second employee "+e2.YearlySal());
        System.out.println("Yearly salary after giving 10% raise "+e2.YearlySal()+0.1*e2.YearlySal());
    }
}
/*Create a class called Employee that includes three pieces of information as for instance variables—
a first name (type String), the last name (type string), and a monthly salary (double).
Your class should have a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly salary is not positive, 
set it to 0.0. Write a test application named EmployeeTest that demonstrates class Employees’ capabilities. 
Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise
and display each Employee’s yearly salary again.*/
