//
public class MilstripParser  implements Parser {
    private static final int SIZE = 80;
    
    public MilstripParser(){
        
    }
    
    public MILS parse(String source) throws FormatException {
        if (source.length() < SIZE) {
            throw new FormatException();
        }
    }
}
