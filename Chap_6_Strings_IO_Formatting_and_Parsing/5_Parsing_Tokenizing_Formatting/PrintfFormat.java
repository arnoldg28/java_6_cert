public class PrintfFormat{

	public static void main(String[] args){
	
	// Sample1
	System.out.printf("%2$d + %1$d\n", 123, 456);
	System.out.format("%2$d + %1$d\n", 123, 456);
		
	//Samples
	int i1 = -123;
	int i2 = 12345;
	
	System.out.format(">%1$(7d< \n",i1);
	System.out.format(">%1$-(7d< \n",i1);	
	System.out.format(">%1$0,7d< \n",i2);
	System.out.format(">%1$+-7d< \n",i2);
	System.out.format(">%2$b + %1$5d< \n",i1, false);
	
	
	}

}