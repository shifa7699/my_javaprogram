package program.com;


public class reverse_string
{
    public static void main(String args[])
    {
        String s="sachin";
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }
    }
}
