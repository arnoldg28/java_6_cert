public class EqualsIgnoreCaseNull{

	public static void main(String args[]){
		
		String sNull = null;
		
		String myString = "test";
		
		System.out.println(myString.equalsIgnoreCase(sNull));
		
		// Result: This will compile (Surely)
		// This will complete successfully with false as result
		
		
	}

}