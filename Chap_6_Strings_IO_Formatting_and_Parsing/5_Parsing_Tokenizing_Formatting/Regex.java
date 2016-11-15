import java.io.Console;
import java.util.regex.*;

public class Regex{

	public static final void main(String[] args){
	
		Console c = System.console();
		
		if(c==null){
			System.out.println("NULL");
		}
		
		while(true){
			
			String ptr = c.readLine("%s", "Input Pattern: ");
			String str = c.readLine("%s", "Input String: ");
			
			Pattern p = Pattern.compile(ptr);
			Matcher m = p.matcher(str);
			
			System.out.println("Pattern is " + m.pattern());
			
			while(m.find()){
				System.out.println(m.start() + " " + m.group());
			}
		
			String cont = c.readLine("%s", "Try Again? y/n: ");
			if(cont.equals("n")){
				break;
			}

		}

	}
}