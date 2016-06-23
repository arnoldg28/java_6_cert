class GrandParentAnimal{
	GrandParentAnimal(){
	System.out.println("GrandParentAnimal");
	}
}

class ParentAnimal extends GrandParentAnimal{
	ParentAnimal(){
	super();
	this("no-arg");	
	}
	ParentAnimal(String name){
	System.out.println("With parameters");
	System.out.println("ParentAnimal "+name);
	}

	public static final void main(String[] args){
	new ParentAnimal();
	System.out.println("\n\n");
	new ParentAnimal("Dog");
	}
}
