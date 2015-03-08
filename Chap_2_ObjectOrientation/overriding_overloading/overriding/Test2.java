//This is to test if a static method can use super

class Parent{

 public static void method(){
	System.out.print("Parent");
 }

}

class Child extends Parent{

 public static void method(){
	super.method();
 }

	public static void main(String[] args){
	Child.method();
	}

}

//Result Compile Error: non-static variable super cannot be reference from a static context