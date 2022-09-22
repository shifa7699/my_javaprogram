package program.com;


public class main_rect {
	public static void main (String args[]){
		rectangle obj = new rectangle();
		obj.length=6;
		obj.breadth=9;
		
		  System.out.println("The area of the rectangle is "+ obj.Area());

}
}
/*create a class Shape with fields  int length,int breadth.
Create another class Rectangle which inherits shape class and
has field int area and calcualteArea method which will return
area = length*breadth.create a main method and create object of
sub class.Assign values to Shape class fields and Calculate the area.*/
