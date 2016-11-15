import java.util.*;
import java.text.*;

public class TheNumberFormatClass{


	public static final void main(String[] args){
	
	printMe("***** Intro Number Format *****");
	diffNumberFormat();

	printMe("***** Other Methods Number Format *****");
	otherMethosNumberFormat();
	
	}

	private static void diffNumberFormat(){
	
		float f1 = 123.4567f;
		Locale locFR = new Locale("fr");
		NumberFormat[] nfa = new NumberFormat[4];
		
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locFR);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locFR);		
	
		for(NumberFormat nf:nfa){
			printMe(nf.format(f1));
		}
	
	}
	
	private static void otherMethosNumberFormat(){
		
		float f1 = 123.45678f;
		NumberFormat nf = NumberFormat.getInstance();
		printMe(nf.getMaximumFractionDigits());
		printMe(nf.format(f1));
		
		nf.setMaximumFractionDigits(5);
		printMe(nf.format(f1));
		
		try{
			printMe(nf.parse("1234.567"));
			nf.setParseIntegerOnly(true);
			printMe(nf.parse("1234.567"));
		
		}catch(ParseException e){ e.printStackTrace(); }
		
	}
	
	private static final void printMe(Object o){
		System.out.println(o.toString());
	}

}