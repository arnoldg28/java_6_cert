import java.io.*;

public class WorkingWithFilesAndDirectories{

	private static PrintWriter pw = new PrintWriter(System.out, true);

	public static void main(String[] args) throws IOException{
		
		//writeFileInDirectory();
		//readFileInDirectory();
		
		//renamingFilesAndDir();
		
		searchFileandDir();
		
	}
	
	private static void writeFileInDirectory() throws IOException{
	
		pw.println("== Creating a directory");
		File myDir = new File("myDir");  // Delete myDir if you want to test the exception
		myDir.mkdir(); // Omitting this line will result to a IOException: No such file or directory. Writer or Stream will often create file for you automaticall if one doe not exist, NOT true for directory
		
		pw.println("== Creating a file inside the created directory");		
		File myFile = new File(myDir, "myFile.txt");
		myFile.createNewFile(); // Exception if no mkdir
		
		pw.println("== Writting data to the created file inside the created directory");		
		PrintWriter pw2 = new PrintWriter(myFile);
		pw2.println("new Stuff");
		pw2.flush();
		pw2.close();
	
	}
	
	private static void readFileInDirectory() throws IOException{
		
		pw. println("== Reading a file in an existing directory");
		File existingDir = new File("myDir");
		pw.println("Is Directory? : " + existingDir.isDirectory());
		
		File existingDirFile = new File(existingDir, "myFile.txt");
		pw.println("Is File? : " + existingDirFile.isFile());
		
		FileReader fr = new FileReader(existingDirFile);
		BufferedReader br = new BufferedReader(fr);
		
		String s = null;
		
		while((s=br.readLine())!=null){
			pw.println(s);
		}
		
		br.close();
		
	}
	
	private static void renamingFilesAndDir() throws IOException{
	
		pw. println("== Renaming a file and directory");
		
		File delDir = new File("delDir");
		delDir.mkdir();
		
		File delFile1 = new File(delDir,"delFile1.txt");
		delFile1.createNewFile();
		
		File delFile2 = new File(delDir,"delFile2.txt");
		delFile2.createNewFile();
		
		delFile1.delete();  // delete a file
		
		pw.println("Delete delDir is:" + delDir.delete()); //attempt to delete the directory
		
		File newName = new File(delDir, "newName.txt"); // new object
		
		delFile2.renameTo(newName); // Rename a file
		
		File newDir = new File("newDir"); // new object
		
		delDir.renameTo(newDir); // Rename a dir
		
	}

	private static void searchFileandDir() throws IOException{
	
		String[] files = new String[100];
		
		File search = new File("C:/DEV/workspaces/gitrepos_others/java_6_cert/Chap_6_Strings_IO_Formatting_and_Parsing/2_FileNavigationAndIO");
		
		files = search.list();
		
		for(String fn:files){
			System.out.println("Found: "+fn);
		}
		
	
	}
	
}