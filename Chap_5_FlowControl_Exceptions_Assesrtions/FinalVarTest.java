// In a local variable, you can still declare a final variable. And you can assign value to it. But once assigned a value, you can never reassign a value again on it.

public class FinalVarTest{
	
	private static final int c = 3;
	
	public static final void main(String args[]){
		final int a = 1;
		final int b;
		
		b = 3;
		
		b = 4;
		
		System.out.println(b);
		
	}
	
}