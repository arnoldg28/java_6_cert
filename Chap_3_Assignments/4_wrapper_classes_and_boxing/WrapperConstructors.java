public class WrapperConstructors{
	public static final void main(String[] args){

	Boolean booleanWP = new Boolean(true);
	Boolean booleanWS = new Boolean("any will result to false");
	
		printMe(booleanWP);
		printMe(booleanWS);

	//Character wrapper class only provides one constructor
	Character charC = new Character('c');

		printMe(charC);
	
	Byte byteP = new Byte((byte)1);
	Byte byteS = new Byte("1");

		printMe(byteP);
		printMe(byteS);
	
	Short shortP = new Short((short)2);
	Short shortS = new Short("2");
		
		printMe(shortP);
		printMe(shortS);
	
	Integer intP = new Integer(1000);
	Integer intS = new Integer("1000");

		printMe(intP);
		printMe(intS);
	
	Long longP = new Long(2000);
	Long longS = new Long("2000");

		printMe(longP);
		printMe(longS);

	Float floatP = new Float(3000f);
	Float floatS = new Float("3000f");

		printMe(floatP);
		printMe(floatS);
	
	Double doubleP = new Double(4000d);
	Double doubleS = new Double("4000d");

		printMe(doubleP);
		printMe(doubleS);

	}
	
	public static void printMe(Object o){
		System.out.println(o);
	}
}

