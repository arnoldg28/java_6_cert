public class SwitchWithBracesOrNot{

	public static final void main(String[] args){
		
		int a = 2;
		
		// No Default sample.
		// Prints Multiple lines inside a case without braces
		switch(a){
			case 1:
				System.out.println("line 1");
				System.out.println("line 1");
			break;
			case 2:
				System.out.println("line 2 - 1");
				System.out.println("line 2 - 1");
			break;		
		}
		
	}

}