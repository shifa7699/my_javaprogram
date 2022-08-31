package program.com;

public class Ford extends Car_1 
{
    int year;
    int manufacturerDiscount;
    Ford (int Speed,double regularPrice,String color, int year, int manufacturerDiscount)
    {
         super (Speed,regularPrice,color);
         this.year = year;
         this.manufacturerDiscount = manufacturerDiscount;
    }
    double getSalePrice() 
    {
            return (super.getSalePrice() - manufacturerDiscount);
    }
}
