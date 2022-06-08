import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class wordcount {
    public static void main(String[] args) throws IOException {
        File f1 = new File("data.txt"); // Creation of File Descriptor for input file
        String[] words = null; // Intialize the word Array
        int wc = 0; // Intialize word count to zero
        FileReader fr = new FileReader(f1); // Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
        String s;
        while ((s = br.readLine()) != null) // Reading Content from the file
        {
            words = s.split(" "); // Split the word using space
            wc = wc + words.length; // increase the word count for each word
        }
        fr.close();
        System.out.println("Number of words in the file:" + wc); // Print the word count
    }
}
