import java.util.*;

/*
Imagine that the Santa Cruz–Monterey ferry has an irregular schedule. Let's
say that we have the daily Santa Cruz departure times stored, in military time, in a
TreeSet.
*/

public class NavigatingTreeSet{

	public static final void main(String[] args){
	
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205); // add some departure times
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		
		// Java 5 version
		
		TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet)times.headSet(1600); // Returns a view of the portion of this set whose elements are "strictly less than" toElement. 
		System.out.println("J5 - last before 4pm is: " + subset.last()); // Returns the last (highest) element currently in this set.
		
		TreeSet<Integer> sub2 = new TreeSet<Integer>();
		sub2 = (TreeSet)times.tailSet(2010); // Returns a view of the portion of this set whose elements are "greater than or equal" to fromElement
		System.out.println("J5 - first after 8:10pm is: " + sub2.first()); // Returns the last (lowest) element currently in this set.
		
		
		// Java 6 version using the new lower() and higher() methods
		System.out.println("J6 - last before 4pm is: " + times.lower(1545)); // Returns the greatest element in this set strictly "less than" the given element, or null if there is no such element.
		System.out.println("J6 - first after 8:10pm is: " + times.higher(2010)); // Returns the least element in this set strictly "greater than" the given element, or null if there is no such element.
		
	}

}