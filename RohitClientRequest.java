
// Java program for client application
import java.rmi.*;
public class RohitClientRequest
{
    public static void main(String args[])
    {
        String answer,value="Reflection in Java";
        try
        {
            // lookup method to find reference of remote object
            RohitSearch access =
                (RohitSearch)Naming.lookup("rmi://localhost:1900"+
                                      "/Rohit");
            answer = access.query(value);
            System.out.println("Article on " + value +
                            " " + answer+" at Rohit");
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}