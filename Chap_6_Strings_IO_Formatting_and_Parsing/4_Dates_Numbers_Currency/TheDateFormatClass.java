import java.text.*;
import java.util.*;

public class TheDateFormatClass{

	public static final void main(String[] args){
	
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

}