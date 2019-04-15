//
public class Main {
  
    public static void main(String args[]) {
    String z;    
	z = "AE1NRPS3110012345678X1SE00050N1112962028460 N14629JHM 1HZN203363BMNMZ    3029700";
	
	MILS milstrip = null;
    Parser parser = new MilstripParser();
    
    try {
        milstrip = (MILS) parser.parse(z);
    } catch (Exception e) {
        e.printStackTrace();
        
    }
    

    System.out.println(z);
    }

}
