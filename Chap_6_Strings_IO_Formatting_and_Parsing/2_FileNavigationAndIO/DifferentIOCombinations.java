import java.io.*;

public class DifferentIOCombinations{

	private static String Combination1_fileName = "Combination1.txt";

	public static final void main(String[] args){
	
		combination1_Writer();
		combination1_Reader();
		combination1_Reader2();
	}
	
	// Combination_1 Writer
	// File, FileWriter, PrintWriter
	private static void combination1_Writer(){

		System.out.println("==== Combination_1 Writer: File, FileWriter, PrintWriter");
		System.out.println("FileName: " + Combination1_fileName);
		
		try{
		File f = new File(Combination1_fileName);
		
		FileWriter fw = new FileWriter(f);
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("line1");
		pw.println("line2");
		
		pw.flush();
		
		pw.close();
		
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	// Combination_1 Reader
	// File, FileReader
	// FileReader part kind a manual
	private static void combination1_Reader(){
	
		System.out.println("==== Combination_1 Reader: File, FileReader");
		System.out.println("FileName: " + Combination1_fileName);
		
		char[] in = new char[50];
		
		int size = 0;
		
		try{
			FileReader fr = new FileReader(new File(Combination1_fileName));
			
			size = fr.read(in);
			
			System.out.println(size);
			
			for(char c:in){
				System.out.print(c);
			}		
			
			fr.close();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		System.out.println("");
	}
	
	// Combination_1 Reader
	// File, FileReader
	// FileReader part kind a manual
	private static void combination1_Reader2(){
	
		System.out.println("==== Combination_1 Reader2: File, FileReader, BufferedReader");
		System.out.println("FileName: " + Combination1_fileName);
		
		
		try{
			FileReader fr = new FileReader(new File(Combination1_fileName));
			
			BufferedReader br = new BufferedReader(fr);
			
			String sLine = null;
			
			while((sLine=br.readLine())!=null){
				System.out.println(sLine);
			}
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}

}

