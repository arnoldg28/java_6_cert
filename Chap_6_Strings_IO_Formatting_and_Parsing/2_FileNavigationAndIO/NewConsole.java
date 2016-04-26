import java.io.Console;

public class NewConsole{

	public static final void main(String[] args){
		Console c = System.console();
		
		if(c==null){
			System.out.println("NULL");
		}
		
		char[] pw;
		
		pw = c.readPassword("%s", "pw: ");
		
		for(char ch:pw){
			c.format("%c ", ch);
		}
		
		c.format("\n");
		
		MyUtility mu = new MyUtility();
		
		while(true){
			String name = c.readLine("%s", "Input: ");
			
			c.format("Output: %s \n", mu.doStuff(name));
			
			if(name.equals("break")){
				break;
			}
			
		}
	
	}

}

class MyUtility{
	String doStuff(String arg1){
		return arg1;
	}
}