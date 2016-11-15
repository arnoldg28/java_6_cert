public class InstantiatingInnerClass{

	private int x = 7;
	
	// Instantiating an Inner Class from Within the Outer Class
	public void makeInner(){
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	class MyInner{
	
		public void seeOuter(){
		
			System.out.println("Outer x is equal to: " + x);
		
		}
		
		// This will cause the compilation to fail! No static method inside an inner class. COMMENT THIS OUT!
		public static void tryStaticInsideInnerClass(){
			System.out.println("This is a static metho inside a class");
		}
	
	}
	
	public static void main(String[] args){
	
		InstantiatingInnerClass outer = new InstantiatingInnerClass();
		
		// Execute instantiation of inner within the outer class
		outer.makeInner();
		
		// Creating an Inner Class Object from Outside the Outer Class Instance Code
		InstantiatingInnerClass.MyInner inner = new InstantiatingInnerClass().new MyInner();
		inner.seeOuter();
	
	}


}