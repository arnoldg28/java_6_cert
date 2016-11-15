import java.util.*;

public class SearchObjArray{

	public static final void main(String[] args){
	
		String[] sa = {"one", "two", "three", "four"};//f,o,t
	
		Arrays.sort(sa);
		for(String s:sa)
			System.out.println(s + " ");
		System.out.println("\none = " + Arrays.binarySearch(sa,"one"));
		
		System.out.println("Now reverse sort");
		ReSortComparator rs = new ReSortComparator();
		Arrays.sort(sa,rs); 
		for(String s:sa)
			System.out.println(s + " ");
		System.out.println("\none = " + Arrays.binarySearch(sa,"one")); // If the collection/array you want to search was sorted using a Comparator, it must be searched using the same Comparator
		System.out.println("one = " + Arrays.binarySearch(sa,"one",rs));		
		
	}
	
	static class ReSortComparator implements Comparator<String>{
	
		public int compare(String a, String b){
			return b.compareTo(a);
		}
	
	}

}