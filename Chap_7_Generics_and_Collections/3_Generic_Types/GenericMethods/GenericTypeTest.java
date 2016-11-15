import java.util.*;

public class GenericTypeTest{

	public static void addAnimal(List<Animal> animals){
		animals.add(new Dog());
	}
	
	public static void addAnimalWildCard(List<? extends Animal> animals){
		//animals.add(new Dog()); // add method will never work in collections with wildcard generic types
		// animals here should only be access in a readOnly Manner 
	}

	public static final void main(String[] args){
	
	// public static void addAnimal(List<Animal> animals) TEST
	List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Dog());
	addAnimal(animals); // OK, since animals matches the method arg
	
	// WildCard Test
	List<Dog> animals2 = new ArrayList<Dog>();
	addAnimal(animals2); // Breaks if the parameter is not Generic type Dog. Will work in wild cards if there is no add method that will be executed
	
	}
	
}

class Animal{}
class Dog extends Animal{}