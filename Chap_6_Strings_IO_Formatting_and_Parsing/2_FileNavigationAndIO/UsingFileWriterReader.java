import java.io.*;

public class UsingFileWriterReader{


	
	public static final void main(String[] args){
		
		char[] in = new char[50]; // to store input
	
		int size = 0;
	
		try{
		
			File file = new File("fileWrite2.txt"); // Just an object
			
			FileWriter fw = new FileWriter(file); // create an actual file & a FileWriter obj
			
			fw.write("howdy\nfolks\n"); // write characters to the file
			
			fw.flush(); //flush before closing
			
			fw.close(); // close file when done
			
			//----------------------------------------------
			
			FileReader fr = new FileReader(file);
			
			size = fr.read(in);
			
			System.out.println("Size: " + size);
			
			for(char c:in){
				System.out.print(c);
			}
			
			// no flush?
			
			fr.close();
			
		}catch(IOException ex){}

	}
}