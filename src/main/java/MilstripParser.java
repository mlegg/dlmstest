import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MilstripParser  implements Parser {
    private static final int SIZE = 80;
    
    public MilstripParser(){
        
    }
    
    @Override
    public MILS parse(String source) throws FormatException {
        if (source.length() < SIZE) {
            throw new FormatException();
            
        }
        MILS milstrip = null;
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

    
}
