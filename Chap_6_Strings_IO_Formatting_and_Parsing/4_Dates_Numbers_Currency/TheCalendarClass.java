import java.util.*;

public class TheCalendarClass{

	public final static void main(String[] args){

		Date d1 = new Date(1000000000000L);
		System.out.println("1st date " + d1.toString());
		
		Calendar c = Calendar.getInstance();
		c. setTime(d1);
		
		if(Calendar.SUNDAY == c.getFirstDayOfWeek())
		System.out.println("Sunday is the first day of the week");
		
		System.out.println("Trillionth milli day of week is " + c.get(Calendar.DAY_OF_WEEK));

		 c.add(Calendar.MONTH, 1);
		 
		 Date d2 = c.getTime();
		 
		 System.out.println("new date " +d2.toString());
		 
		 System.out.println("**** Using roll adding 9 months. Other field not affected****");
		 
		 c.roll(Calendar.MONTH, 9);
		 
		 d2 = c.getTime();
		 
		 System.out.println("roll date " +d2.toString());
		 
		 

	}
	
}