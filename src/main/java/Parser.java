import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public interface Parser {
    MILS parse(File source) throws FormatException, IOException;
	MILS parse(String source) throws FormatException;
	MILS parse(InputStream source) throws FormatException, IOException;
    
}
