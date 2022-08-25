package program.com;


public class char_check 
{
	public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character to check: ");
        ch=sc.next().charAt(0);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("It's a vowel");
        }
        else if(!(ch>='a' && ch<='z' || ch>='A' && ch<='Z') )
        {
            System.out.println("ERROR");
        }
        //if(ch>=1)
        else      
        {
            System.out.println("It's a consonant");
        }
    }
}
/*Write a Java program that takes the user to provide a single character from the alphabet. 
Print Vowel or Consonant, depending on the user input. If the user input is not a letter
 (between a and z or A and Z), or if a length of string > 1, print an error message.*/   

}
