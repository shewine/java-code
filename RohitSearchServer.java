// Java program for server application
import java.rmi.*;
import java.rmi.registry.*;
public class RohitSearchServer
{
	public static void main(String args[])
	{
		try
		{
			// Create an object of the interface
			// implementation class
			RohitSearch obj = new RohitSearchQuery();

			// rmiregistry within the server JVM with
			// port number 1900
			LocateRegistry.createRegistry(1900);

			// Binds the remote object by the name
			// geeksforgeeks
			Naming.rebind("rmi://localhost:1900"+
						"/geeksforgeeks",obj);
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
	}
}
