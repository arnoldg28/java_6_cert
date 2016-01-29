import java.util.*;

public class InstanceOfCompilerErrorTest{

	public static final void main(String[] args){
		Dog d = new Dog();

		//System.out.println(d instanceof Cat);

		Map m = new HashMap();

		System.out.println("m instanceof Date:" + (m instanceof Date));
		

	}

}

class Cat{}
class Dog{}
