// Java program to implement the Search interface
import java.rmi.*;
import java.rmi.server.*;
public class RohitSearchQuery extends UnicastRemoteObject implements RohitSearch
						
{
	// Default constructor to throw RemoteException
	// from its parent constructor
	RohitSearchQuery() throws RemoteException
	{
		super();
	}

	// Implementation of the query interface
	public String query(String search)
					throws RemoteException
	{
		String result;
		if (search.equals("Reflection in Java"))
			result = "Found";
		else
			result = "Not Found";

		return result;
	}
}
