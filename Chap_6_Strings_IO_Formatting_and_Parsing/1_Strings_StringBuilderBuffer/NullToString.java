public class NullToString{

	public static void main(String[] args){
	
		String sNull = null;
		
		String newString = new String(sNull); //Runtime Error on this part
		
		System.out.println(newString);
		
		
	
	}

}