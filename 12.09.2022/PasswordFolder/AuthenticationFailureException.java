package program.com;


public class AuthenticationFailureException extends Exception
{
    public AuthenticationFailureException(String msg) 
    {
	super(msg);
    }
}
