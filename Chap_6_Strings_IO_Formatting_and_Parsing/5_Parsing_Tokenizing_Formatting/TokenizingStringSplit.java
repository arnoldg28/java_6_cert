import java.util.*;

public class TokenizingStringSplit{

	public final static void main(String[] args){

		String[] tokens = args[0].split(args[1]);
		
		System.out.println("Count: " + tokens.length);
		
		for(String s : tokens)
			System.out.println(">"+ s +"<");
	
	}

}