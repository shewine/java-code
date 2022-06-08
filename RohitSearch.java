
// Creating a Search interface
import java.rmi.*;
public interface RohitSearch extends Remote
{
    // Declaring the method prototype
    public String query(String search) throws RemoteException;
}