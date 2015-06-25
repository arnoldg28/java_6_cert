//This is a sample of an instance counter using a static variable
class Frog{
	static int frogCount = 0;

	public Frog(){
	frogCount++;
	}

	public static final void main(String[] args){
		new Frog();
		new Frog();
		new Frog();
		new Frog();
		System.out.println("Frog count is now " + frogCount);
		System.out.println("Frog.frogCount is " + Frog.frogCount); 
	}

}
