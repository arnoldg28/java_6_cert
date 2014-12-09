//This will show that even if the subtype that overrides a method does not declare any exception.
// But the super type declares and exception, and you use the super type as reference you still needs to handle the exception.

class Animal{

	public void eat() throws Exception{
	// throws exception
	}
	
}

class Dog2 extends Animal{
	public void eat(){}

	public static final void main(String[] args){
		Animal a = new Dog2();
		Dog2 d = new Dog2();
		a.eat();//unreported exception
		d.eat();//ok!
	}

}