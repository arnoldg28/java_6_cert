import java.util.*;
import java.text.*;

public class TheLocaleClass{
	
	public static final void main(String[] args){
	
		Calendar c = Calendar.getInstance();
		c.set(2010,11,14);
	
		Date d2 = c.getTime();
	
		Locale locIT = new Locale("it", "IT"); // Italy
		Locale locPT = new Locale("pt"); // Portugal
		Locale locBR = new Locale("pt", "BR"); // Brazil
		Locale locIN = new Locale("hi", "IN"); // India
		Locale locJA = new Locale("ja"); // Japan
	
		DateFormat dfUS = DateFormat.getInstance();		
		printMe("US " + dfUS.format(d2));
	
	}
	
	private static final void printMe(String s){
		System.out.println(s);
	}
	
}