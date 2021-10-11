import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Csvfile {
	public static void main(String []args) throws FileNotFoundException {

    String CSV_read_path="C:\\Users\\om\\Documents\\noman123.csv";
	
    Scanner sc = new Scanner(new File(CSV_read_path));
    
    sc.useDelimiter(",");
    
    while(sc.hasNext())
    {
    	System.out.println(sc.next());
    }
    sc.close();
    	
}
}

