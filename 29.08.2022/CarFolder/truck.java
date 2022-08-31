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
 /*Create a super class called Car. The Car class has the following fields and methods.
◦intspeed;
◦doubleregularPrice;
◦Stringcolor;
◦doublegetSalePrice();

Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
◦intweight;
◦doublegetSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.

Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
◦intyear;
◦intmanufacturerDiscount;
◦doublegetSalePrice();//FromthesalepricecomputedfromCarclass,subtractthemanufacturerDiscount.*/
