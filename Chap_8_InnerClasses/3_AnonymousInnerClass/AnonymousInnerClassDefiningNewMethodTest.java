public class AnonymousInnerClassDefiningNewMethodTest{

	Popcorn p = new Popcorn(){
	
		public void pop(){
			System.out.println("Anonymous popcorn");
		}
		
		// New method added to the anonymous class. What will Happen!?!?!
		// This part is Legal
		public void sizzle(){
			System.out.println("Anonymous sizzling popcorn");
		}
	
	};
	
	public void popIt(){
	
		p.pop();
		p.sizzle(); // This is ILLEGAL since we are using the reference Popcorn. And we have no way of knowing that the new method in the anonymous class exist since we have no reference in an anonymous class instance that was created.
	
	}
	


}

class Popcorn{

	public void pop(){
	
		System.out.println("popcorn");
	
	}

}