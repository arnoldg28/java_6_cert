import java.util.*;

public class TokenizingScanner{

	public final static void main(String[] args){
		
		boolean b2, b;
		
		int i;
		
		String s, hits = " ";
		
		Scanner s1 = new Scanner(args[0]);
		Scanner s2 = new Scanner(args[0]);
		
		s1.useDelimiter(","); // You can comment this out to use space as defalut delimiter
		s2.useDelimiter(","); // You can comment this out to use space as defalut delimiter
		
		//1st loop
		while(b = s1.hasNext()){
			s = s1.next(); hits += "s";
		}
		
		while(b = s2.hasNext()){
			
			if(s2.hasNextInt()){
				i = s2.nextInt(); hits += "i";
			}else if(s2.hasNextBoolean()){
				b2 = s2.nextBoolean(); hits += "b";
			}else{
				s2.next(); hits += "s2";
			}
			
		}
		
		System.out.println("hits " + hits);
	
	}

}