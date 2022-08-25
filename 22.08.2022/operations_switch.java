package program.com;

import java.util.*;
public class operations_switch
{
	public static void main(String args[])
	{
		int a,b,c,ans;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number ");
        int a=sc.nextInt();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2nd number ");
        int b=sc.nextInt();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:- ");
        int c=sc.nextInt();
			switch(c)
		{
			case 1:
				ans=a+b;
				System.out.printn("The sum is:- "+ans);
				break;
				case 2:
					ans=a-b;
					System.out.printn("The difference is:- "+ans);
					break;
					case 3:
						ans=a*b;
						System.out.printn("The product is:- "+ans);
						break;
						case 4:
							ans=a/b;
							System.out.printn("The quotient is:- "+ans);
							break;
							default:
								System.out.printn("INVALID CHOOICE");
								break;
		}
	}

}
