//This will test that the argument list must be exact for to be overriding.
//If not it can be overloading.

class Parent{}

class Child extends Parent{}

class OverridenClass{

 void testMethod(int a, Parent p){
	System.out.println("Parent Method");
 }

}

class OverridingClass extends OverridenClass{
//This is not an overloaded method. If the reference variable type is not OverridingClass.
//The method that will execute is still the Overridend class. Please see main.
 void testMethod(int a, Child p){
	System.out.println("Child Method");
 }
}

class Main{
 static final public void main(String args[]){
	OverridenClass o = new OverridingClass(); //lOOKOUT! THIS IS PARENT REFERENCING A CHILD
	o.testMethod(0,new Parent());
	o.testMethod(0,new Child());

	//Output: this is overloaded in child only not affecting parent.
	// Parent Method
	// Parent Method
 }
}
