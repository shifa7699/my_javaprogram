package program.com;


public class Truck extends Car_1 
{
    int weight;
    Truck (int Speed,double regularPrice,String color, int weight) 
    {
        super(Speed,regularPrice,color);
        this.weight = weight;
    }
        double getSalePrice() 
        {
            if (weight > 2000)
            {
                return super.getSalePrice() - (0.1 * super.getSalePrice());
            }
            else 
            {
                return super.getSalePrice();
            }
        }
 }