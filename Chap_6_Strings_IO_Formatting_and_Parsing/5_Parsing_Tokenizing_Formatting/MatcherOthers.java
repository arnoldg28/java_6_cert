
import java.util.regex.*;

public class MatcherOthers{

	public static final void main(String[] args){


		appendReplacementandTail();
		System.out.println("------------------------------------------");
		replaceAll();
	
	}
	
	private static void appendReplacementandTail(){
		Pattern p = Pattern.compile("cat");
		 Matcher m = p.matcher("one cat two cats in the yard");
		 StringBuffer sb = new StringBuffer();
		 while (m.find()) {
			 m.appendReplacement(sb, "dog");
		 }
		 
		 m.appendTail(sb); //It is intended to be invoked after one or more invocations of the appendReplacement method in order to copy the remainder of the input sequence.
		 System.out.println(sb.toString());
	
	}
	
	private static void replaceAll(){
			Pattern p = Pattern.compile("cat");
			Matcher m = p.matcher("one cat two cats in the yard");
			System.out.println(m.replaceAll("dog"));
	}

}