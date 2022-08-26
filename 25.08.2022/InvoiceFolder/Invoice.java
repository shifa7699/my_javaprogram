package program.com;

import java.util.*;
public class Invoice 
{
     public static void main(String args[]) 
      {
          Scanner sc=new Scanner(System.in);
          String p_no,p_des;
          int quantity;
          double price;
          System.out.println("Enter part no"); 
          p_no=sc.next();
          System.out.println("Enter the part description");
          p_des=sc.next();
          System.out.println("Enter the quantity ");
          quantity=sc.nextInt();
          System.out.println("price per item");
          price=sc.nextDouble();
          Invoice ob1=new Invoice(p_no,p_des,quantity,price);
          System.out.println("Amount="+ob1.getInvoice());
      }
}   
