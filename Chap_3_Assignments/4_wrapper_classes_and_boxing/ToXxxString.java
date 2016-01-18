// toXxxString() is a static method of Integer and Long wrapper classes

public class ToXxxString{
	public final static void main(String[] a){
		
		String si1 = Integer.toBinaryString(254);
		String si2 = Integer.toHexString(254);
		String si3 = Integer.toOctalString(254);

		System.out.println("Integer.toByteString(254) = " + si1);
		System.out.println("Integer.toHexString(254) = " + si2);
		System.out.println("Integer.toOctalString(254) = " + si3);
		
		// This are all also applicable to Long wrapper class



	}
}
