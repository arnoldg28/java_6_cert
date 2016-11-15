import java.io.*;
import java.util.*;

public class DVDInfo implements Comparable<DVDInfo>{

	private String title;
	private String genre;
	private String leadActor;
	
	public DVDInfo(String title, String genre, String leadActor){
		this.title = title;
		this.genre = genre;
		this.leadActor = leadActor;
	}
	
	public String toString(){
	
		return this.title + " " + this.genre + " " + this.leadActor +"\n";
	
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getGenre(){
		return this.genre;
	}
	
	
	// Generics Version
	public int compareTo(DVDInfo d){
		return this.title.compareTo(d.getTitle());
	}
	
	/* Pre Java 5 compareTo() Version

	public int compareTo(Object o){
		DVDInfo d = (DVDInfo)o;
		return this.title.compareTo(d.getTitle());
	}
		
	*/
	
	
	public static final void main(String[] args){
	
		List<DVDInfo> dvdInfoList = new ArrayList<DVDInfo>();
		populatelist(dvdInfoList);
		System.out.println("Before: ");
		System.out.println(dvdInfoList);
		Collections.sort(dvdInfoList); // will cause compile error if the DVDInfo do not implement Comparable
		System.out.println("After: ");
		System.out.println(dvdInfoList);
		System.out.println("Genre Sort: ");
		Collections.sort(dvdInfoList,new GenreSort()); // Using Comparator
		System.out.println(dvdInfoList);
		
		int[] a = {4,3,2,1};
		Arrays.sort(a);
		
		for(int y:a){
		System.out.println(y);
		}
		
		
	}
	
	private static void populatelist(List<DVDInfo> dvdInfoList){
			
		String fileName = "DVDInfoFile.txt";
		try{
			FileReader fr = new FileReader(new File(fileName));
			
			BufferedReader br = new BufferedReader(fr);
			
			String sLine = null;
			
			while((sLine=br.readLine())!=null){
				String[] record = sLine.split("/");
				dvdInfoList.add(new DVDInfo(record[0], record[1], record[2]));
			}
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
	
	}
	
	// Inner static class used for Comparator
	static class GenreSort implements Comparator<DVDInfo>{

		public int compare(DVDInfo one, DVDInfo two){
			return one.getGenre().compareTo(two.getGenre());
		}
	
	}

}
