import java.util.*;

public class PQ{

	static class PQsort implements Comparator<Integer>{
	
		public int compare(Integer one, Integer two){
			return two - one;
		}
	
	}
	
	public static final void main(String[] args){
		
		int[] ia = {1,5,3,7,6,9,8};
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(); // this is by default using natural order
		
		for(int x : ia)
			pq1.offer(x);
		
		for(int x : ia)
			System.out.print(pq1.poll() + " ");
		System.out.println("");

		
		PQsort pqs = new PQsort();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10,pqs); // get a comparator
		
		for(int x : ia)
			pq2.offer(x);
		
		System.out.println("size " + pq2.size());
		System.out.println("peek " + pq2.peek());
		System.out.println("size " + pq2.size());
		System.out.println("poll " + pq2.poll());
		System.out.println("size " + pq2.size());
		
		for(int x : ia)
			System.out.print(pq2.poll() + " ");
		
	}


}