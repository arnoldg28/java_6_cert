import java.util.*;

public class HashSetAndTreeSet{

	public final static void main(String[] args){
	
		boolean[] ba = new boolean[5];
		
		//Set s = new HashSet(); // This will have unpredictable order of objects
		Set s = new TreeSet(); // This will throw an exception since objects that was inserted are NOT mutually comparable
		
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add(new Object());
		
		for(int x=0; x<ba.length; x++){
			System.out.println(ba[x] + " ");
		}
		System.out.println("\n");
		
		for(Object o : s){
			System.out.println(o + " ");
		}
				
	}

}