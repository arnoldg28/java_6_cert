import java.util.*;

public class TheDateClass{

	public static final void main(String[] args){
	
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date " + d1.toString());
		
		d1.setTime(d1.getTime() + 3600000); // 3600000 millis / hour
		System.out.println("Plus an hour " + d1.toString());
	
	}

}