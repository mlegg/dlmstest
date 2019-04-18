//
public class Main {
  
    public static void main(String args[]) {
    String z;  
   
	z = "AE1NRPS3110012345678X1SE00050N1112962028460 N14629JHM 1HZN203363BMNMZ    3029700 \nAE2NRPS3110012345678X1SE00050N1112962028460 N14629JHM 1HZN203363BMNMZ    3029700 \nAE3NRPS3110012345678X1SE00050N1112962028460 N14629JHM 1HZN203363BMNMZ    3029700";

	
	MILS milstrip = null;
    Parser parser = new MilstripParser();
    
    try {
        
        milstrip = (MILS) parser.parse(z);
        
        System.out.println(countLines(z));
        //for (Loop txBlock : countLines(z)) {
        //}
        //int y;
        //while (y <= countLines(z))
        //{
            //loop statements...
          //  y++;
        //}
        
    } catch (Exception e) {
        e.printStackTrace();
        
    } finally {
        
        	//private static MilsConfig loadCf() {
		MilsConfig cfMILS = new MilsConfig("MILS");
		cfMILS.addChild("DOCID", z.substring(0,3));
		cfMILS.addChild("ROUTINGID",  z.substring(3,6));

		cfMILS.addChild("M&S",  z.substring(6,7));
		cfMILS.addChild("FSC",  z.substring(7,11));
		cfMILS.addChild("NIIN", z.substring(11,20));
		System.out.println(cfMILS);
		//return configMils;
        
    }
    

	
    }

    private static int countLines(String str){
        String[] lines = str.split("\r\n|\r|\n");
        return  lines.length;
    }

}


