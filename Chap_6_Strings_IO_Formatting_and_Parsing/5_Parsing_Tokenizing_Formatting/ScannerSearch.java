import java.util.*;

public class ScannerSearch{

	public final static void main(String[] args){

		System.out.println("Input: ");
		//System.out.flush();
		
		try{
		
			Scanner s = new Scanner(System.in);
			String token;
			do{
				token = s.findInLine(args[0]);
				System.out.println("Found: " + token);
			}while(token != null);
		
		}catch(Exception e){ e.printStackTrace(); }
	
	
	}

}