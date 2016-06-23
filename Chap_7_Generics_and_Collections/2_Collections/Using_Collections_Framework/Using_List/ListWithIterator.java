import java.util.*;

public class ListWithIterator{
	
	public static final void main(String[] args){
		List<Dog> dList = new ArrayList<Dog>();
		
		Dog dog = new Dog("aiko");
		
		dList.add(dog);
		dList.add(new Dog("clover"));
		dList.add(new Dog("magnolia"));
		
		Iterator<Dog> i3 = dList.iterator();
		
		while(i3.hasNext()){
			Dog d2 = i3.next();
			System.out.println(d2.name);
		}
		
		System.out.println("Size: " + dList.size());
		System.out.println("get1: " + dList.get(1).name);
		
		// indexOf is using the equals() method of the object (This time its defauls == since equals was not overriden).
		// We successfully got the index of the object since we are using the same reference of the object even if we did not overriden the equals method.
		System.out.println("aiko index: " + dList.indexOf(dog));  
		
		dList.remove(2);
		
		Object[] oa = dList.toArray();
		
		for(Object o:oa){
		Dog d2 = (Dog)o;
		System.out.println("oa: " + d2.name);  
		}
		
	}
}

class Dog{
	
	public String name;
	
	public Dog(String n){
		name = n;
	}
	
}

