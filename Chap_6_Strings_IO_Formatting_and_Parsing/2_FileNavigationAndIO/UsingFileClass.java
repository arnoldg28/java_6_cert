import java.io.*;

public class UsingFileClass{

	public static final void main(String[] args){
		
		try{
			
			boolean newFile = false;
			
			File file = new File("fileWriter1.txt");
			
			System.out.println(file.exists());
			
			newFile = file.createNewFile();
			
			System.out.println(newFile);
			
			System.out.println(file.exists());
		
		}catch(IOException e){}
	
	}

}