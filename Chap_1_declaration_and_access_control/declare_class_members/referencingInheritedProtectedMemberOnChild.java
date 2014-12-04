//Any name of the file is ok. No public class in this file.

class Parent{
	protected int x = 0;
}

class Child extends Parent{

}
 
//This is valid as long as in the same package.
//If both Child and Neighbor are both in a different package. Then x will no be anymore
//visible to Neighbor.
class Neighbor{
	void test(){
	Child c = new Child();
	System.out.print(c.x);
	}	
}