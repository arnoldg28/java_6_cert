import java.util.*;

public class ConvertingArraysToListViceVersa{

	//List and Set classes have toArray
	// Arrays class has a asList()
	
	public static final void main(String[] args){
		System.out.println("== asList(<array here>) sample ===");
		asList_Sample();
		
		System.out.println("== List.toArray(), List.toArray(<Destination array here>)  sample ===");
		toArray_sample();
		
	}
	
	
	// When you use asList() method, The array and the List become joined in the hip
	private static void asList_Sample(){
	
		String[] sa = {"one", "two", "three", "four"};
		
		List sList = Arrays.asList(sa);
		
		System.out.println("Size " + sList.size());
		System.out.println("idx2 " + sList.get(2));
		
		// Try add to List. Lets see what happend to the array
		// java.lang.UnsupportedOperationException will be thrown
		// Returns a fixed-size list backed by the specified array. 
		
		//sList.add("test");
		
		sList.set(3,"six");
		sa[1] = "five";
		
		for(String s:sa)
			System.out.print(s + " ");
		
		System.out.println("\ns1[a] " + sList.get(1));
		
	}
	
	// Comes in two flavors. One the returns a new Object array, and the one that uses the array you send it as the destination array
	
	private static void toArray_sample(){
		
		List<Integer> iL = new ArrayList<Integer>();
		for(int x =0; x<3;x++)
		iL.add(x);
		
		System.out.println("Object array");
		Object[] oa = iL.toArray();
		for(int i =0; i<oa.length;i++)
		System.out.println(oa[i]);
			
		System.out.println("Integer array");
		Integer[] ia2 = new Integer[1]; // Just need to return the aproppritate array type
		ia2 = iL.toArray(ia2);
		for(int i =0; i<oa.length;i++)
		System.out.println(ia2[i]);
		
	
	}



}