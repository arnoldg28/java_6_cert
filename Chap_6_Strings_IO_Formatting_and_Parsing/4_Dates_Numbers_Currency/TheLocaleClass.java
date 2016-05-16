import java.util.*;
import java.text.*;

public class TheLocaleClass{

	public static final void main(String[] args){
		printMe("***** Dates from different locale *****");
		diffLocaleDate();
		
		printMe("***** Display Language Sample *****");
		displayLanguage();

		
	}
	
	private static void diffLocaleDate(){
	
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
		
		DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
		printMe("US full " + dfUSfull.format(d2));
		
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		printMe("Italy " + dfIT.format(d2));
		
		DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
		printMe("Portugal " + dfPT.format(d2));
		
		DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
		printMe("Brazil " + dfBR.format(d2));

		DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
		printMe("India " + dfIN.format(d2));
		
		DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
		printMe("Japan " + dfJA.format(d2));
	
	}
	
	private static void displayLanguage(){
		Calendar c = Calendar.getInstance();
		c.set(2010,11,14);
		Date d2 = c.getTime();
		
		Locale locBR = new Locale("pt", "BR"); // Brazil
		Locale locDK = new Locale("da", "DK"); // Denmark
		Locale locIT = new Locale("it", "IT"); // Italy
		
		printMe(" def " + locBR.getDisplayCountry());
		printMe(" loc " + locBR.getDisplayCountry(locBR));
		
		printMe(" def " + locDK.getDisplayCountry());
		printMe(" loc " + locDK.getDisplayCountry(locDK));
		printMe(" D>I " + locDK.getDisplayCountry(locIT));
		
	}

	private static final void printMe(String s){
		System.out.println(s);
	}

}
