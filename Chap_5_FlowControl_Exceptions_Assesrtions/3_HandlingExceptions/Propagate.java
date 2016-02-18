public class Propagate{

	public final static void main(String args[]){
	
	String word = "";
	
	if(args.length>0){
		word = args[0];
	}
	
	String reverseAns = "";
	
	System.out.println("Before: "+word);
	
	try{
	reverseAns = reverse(word);
	System.out.println("After: "+reverseAns);	
	}catch(Exception e){
		System.out.println("Exception occured! "+e);
	}finally{
		System.out.println("Finally block");
	}

	}

		
	private static String reverse(String word) throws Exception{
	
		if(word==null || word.length() == 0){
			throw new Exception("This is my Exception");
		}
		
		String reverse = "";
		
		for(int i=word.length()-1;i>=0;--i){
			reverse+=word.charAt(i);
		}
		
		return reverse;
		
	}
}