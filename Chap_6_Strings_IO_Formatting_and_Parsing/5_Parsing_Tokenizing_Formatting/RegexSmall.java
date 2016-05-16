import java.util.regex.*;

public class RegexSmall{

	public static final void main(String[] args){
	
		Pattern p = Pattern.compile("ab"); //the expression
		Matcher m = p.matcher("abaaaba");  //the source
		
		while(m.find()){
			System.out.println(m.start() + " ");
		}
	
	}

}