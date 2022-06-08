import java.io.*;
class Pract2
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            // Command to create an external process 
		String command1 = "javac Thread1.java"; 
		String command2 = "java Thread1"; 
	  

            // Running the above command 
            	Runtime run1  = Runtime.getRuntime(); 
            	Process proc1 = run1.exec(command1); 

            	Runtime run2  = Runtime.getRuntime(); 
            	Process proc2 = run2.exec(command2);


 	
	InputStream ins = proc2.getInputStream();
	    String line = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(ins));
        while ((line = in.readLine()) != null)
           {
		System.out.println(" " + line);
           }

        } 
  
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 