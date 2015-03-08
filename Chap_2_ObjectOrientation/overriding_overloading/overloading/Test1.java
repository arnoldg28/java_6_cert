class Animal{
	public void eat(){
	System.out.println("Generic animal eating");
	}
}

class Horse extends Animal{
	public void eat(){
	System.out.println("Horse eating hay");
	}

	public void eat(String s){
	System.out.println("Horse eating "+s);
	}

	final static public void main(String[] args){

		Animal a = new Animal();
		a.eat(); //Generic animal eating

		Horse h = new Horse();
		h.eat(); // Direct call new method. (Overriden actually)
  			 // Horse eating hay

		Animal ah = new Horse();
		ah.eat();//Horse eating hay
			 // This is the where polymorphism takes place. Overriden method is called in the actual object.
		
		Animal a2 = new Animal();
		a2.eat("grass"); //Compile Error!
				// Where the hell did the animal get that method?

		Animal a3 = new Horse();
		a3.eat("Weeds"); //Compile error!
				// Yes.. yes it is a horse object. But it is not existing in the reference type animal.
				// No overriding and no overloading in here.

	}
}

