public class BoxingEqualEqual_Equals{
	
	public final static void main(String[] a){

	Integer i1 = 1000;
	Integer i2 = 1000;

	if(i1 != i2) System.out.println("Differenct Objects");
	if(i1.equals(i2)) System.out.println("Meaningfully equal");
	if(i1 == i2) System.out.println("same Objects");
	// this will print if i1 and i2 ranges from -128 to 127
	
	// In order to save memory, two instance of the following wrapper objects (created through boxing), will always be == when their primitive values are the same.

	// Boolean
	// Byte
	// Character from \u0000 to \u007f (7f is 127 in decimal
	// Short and Integer from -128 to 127

	// All 32 bit integer type






	}

}
