public class StackOverflowErrorSample{

	private static int ctr = 1;

	public static final void main(String[] args){
		recursiveGo();
	}

	public static void recursiveGo(){
		
		System.out.println("Call number:" + (++ctr));
		recursiveGo();
		
	}

}