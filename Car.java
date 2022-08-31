package program.com;


public class Car
{
	int speed;
    double regularPrice;
    String color;
    Car (int Speed,double regularPrice,String color)
    {
        this.speed = Speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    double getSalePrice() 
    {
        return regularPrice;
    }
}
