public class SwitchSample{
	
	public static void main(String[] args){
		
		int a = 4;
		
		switch(a){
			
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println("a is an even number");
			default:
				System.out.println("This code will run if no case is chosen, Or if cases before it that has been triggered has no break");
			
			
			System.out.println("==============================================");
			
			System.out.println("Exercise:");
	
			char letterChar = 'c';
			
			switch(letterChar){
				
				case 'a': System.out.println("This case is 'a' - Letter: " + letterChar);break;
				
				default: System.out.println("This is default - Letter: " + letterChar);
				
				case 'b': System.out.println("This case is 'b' - Letter: " + letterChar);
				
			}

	
		}
		
	}
	
}