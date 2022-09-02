package program.com;

import java.util.*;
public class Items
{
    int code,price;
    Item(int c,int p)
    {
        code=c;
        price=p;
    }   
    public static void main(String args[])
    {
        int sum=0,i;
        Item it[]=new Item[5];
        for( i=0;i<5;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the code");
            int co=sc.nextInt();
            System.out.println("enter the price");
            int pr=sc.nextInt();
            it[i]=new Item(co,pr);
        }
        for(i=0;i<5;i++)
        {
            System.out.println("code: "+it[i].code+" "+"price: "+it[i].price);
        }        
        for(i=0;i<5;i++)
        {
            sum=sum+it[i].price;
        }
        System.out.println("Total: "+sum);      
        
    }
}

