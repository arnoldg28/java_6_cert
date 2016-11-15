import java.text.*;
import java.util.*;

public class TheDateFormatClass{

	public static final void main(String[] args) throws Exception{
		System.out.println("*** Different Format Sample ***");
		differentFormatSamples();
		
		System.out.println("*** The Parse Method Sample ***");
		theParseMethod();
	}
	
	private static void differentFormatSamples(){
		
		Date d1 = new Date(1000000000000L);
		
		System.out.println(d1.toString());
		
		DateFormat[] dfa = new DateFormat[6];

		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);

		for(DateFormat df:dfa)
			System.out.println(df.format(d1));
		
	}
	
	private static void theParseMethod()throws ParseException{
		
		Date d1 = new Date(1000000000000L);
		System.out.println("d1 " + d1.toString());
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		
		String s = df.format(d1);
		
		System.out.println(s);
		
		Date d2 = df.parse(s);
		System.out.println("parsed = " + d2.toString());
		
	}

}