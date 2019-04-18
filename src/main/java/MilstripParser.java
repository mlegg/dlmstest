import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MilstripParser  implements Parser {
    private static final int SIZE = 80;
    
    public MilstripParser(){
        
    }
    
    @Override
    public MILS parse(String source) throws FormatException {
        if (source.length() < SIZE) {
            throw new FormatException();
            
        }
        
       // System.out.println("parse : " + source);
                
        Scanner scanner = new Scanner(source);
		Milstrip milstrip = scanSource(scanner);
		scanner.close();
        
        return milstrip;
        
    }
    
    @Override
	public MILS parse(File fileName) throws FormatException, IOException {
	     MILS milstrip = null;
	    return milstrip;
    }
    
    //private Milstrip scanSource(Scanner scanner, Context context) {
    //}
    
    @Override
	public MILS parse(InputStream source) throws FormatException, IOException {
	    
	    MILS milstrip = null;
	    return milstrip;
    }
    
    /**
	 * private helper method
	 * @param scanner
	 * @return
	 */
private Milstrip scanSource(Scanner scanner) {

		Milstrip milstrip = new Milstrip();

	       while (scanner.hasNext()) {
	           String line = scanner.nextLine();
	           List<String> tokens = new ArrayList<String>();
        	   tokens = Arrays.asList(line.substring(0,80));
	           //System.out.println("Tx: " + tokens);
	           // retrieving data from string list array in for loop
                for(String s: tokens){
	                   System.out.println(s);
	                    //milstrip = s;
            	}
	           
               
       }


		return milstrip;
    }
	

    
}
