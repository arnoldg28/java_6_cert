import java.io.*;

public class SuperNotSerial{

	public static final void main(String[] args){
	
		Dog d = new Dog(35, "Fido");
		
		System.out.println("before: " + d.name +" "+ d.weight);
		
		try{
			FileOutputStream fos = new FileOutputStream("SuperNotSer.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
		}catch(Exception e){e.printStackTrace();}
	
		try{
			FileInputStream fis = new FileInputStream("SuperNotSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog)ois.readObject();
			ois.close();
		}catch(Exception e){e.printStackTrace();}
	
		System.out.println("after: " + d.name +" "+ d.weight);	
	}

}

class Dog extends Animal implements Serializable{
	String name;
	
	Dog(int w, String n){
		weight = w;
		name = n;
	}
	
}

class Animal{
	int weight = 42;
}