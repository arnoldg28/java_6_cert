public class ValueOfMethod{

// There are usually two type of static valueOf() methods provided in most of the wrapper classes

// valueOf() return an Instance of the wrapper class
// Takes String or String,base

	public static final void main(String[] args){
		Integer i2 = Integer.valueOf("101011", 2);

		System.out.println(i2);

		Float f = Float.valueOf("3.14f");
		Float f2 = Float.valueOf("3.14");

		System.out.println(f);
		System.out.println(f2);


	}


}
