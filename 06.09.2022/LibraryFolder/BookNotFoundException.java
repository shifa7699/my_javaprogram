package program.com;


public class BookNotFoundException extends Exception 
{
    public BookNotFoundException(String msg)
    {
        super(msg);
    }
}