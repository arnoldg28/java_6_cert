import java.util.*;
public class AutoBoxingWithCollections{

	public static final void main(String[] args){
		
		preJava5Wrapping();
		
	}
	
	//pre java 5 implementation
	public static void preJava5Wrapping(){
	
	List myInts = new ArrayList();
	myInts.add(new Integer(42));
	myInts.add("test"); //this is valid
	myInts.add(42); // Autoboxing in as of java 5
	System.out.println(myInts);
	
	}

}