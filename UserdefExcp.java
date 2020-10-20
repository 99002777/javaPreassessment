import java.util.*;
class UnderAgeException extends Exception
{
    public UnderAgeException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class Voting
{
   void Check(int age) throws UnderAgeException{
	if(age<18){
		throw new UnderAgeException("You are Under Age");
	}
   }
   
    public static void main(String args[])
    {
    	Voting obj = new Voting();
        try
        {
            obj.Check(16);
        }
        catch (UnderAgeException e)
        {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
    }
}