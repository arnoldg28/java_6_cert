import java.util.*;

public class TestBadLegacy{

	public static final void main(String[] args){
	
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		
		Inserter in = new Inserter();
		
		in.insertAnInteger(myList);
		
		in.insertAString(myList);
		
		System.out.println(myList);
		
	}
	
}

class Inserter{
	
	//method with a non-generic List argument
	void insertAnInteger(List list){
		list.add(new Integer(42));
	}
	
	// put a String in the list passed in
	void insertAString(List list){
		list.add("This is a String");
	}
	
}