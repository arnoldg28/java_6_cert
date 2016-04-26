import java.io.*;

class SerializeDog{

	public static final void main(String[] args){
		
		Collar c = new Collar(3);
		Dog d = new Dog(c,3);
		
		System.out.println("before: collar size is "+ d.getCollar().getCollarSize());
		
		try{
			FileOutputStream fs = new FileOutputStream("DogSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		// Just to make sure that the one we are reading is from the object that was serialized
		d = null;
		
		try{
			FileInputStream fis = new FileInputStream("DogSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog)ois.readObject();
			ois.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("After: collar size is "+ d.getCollar().getCollarSize());		
		
	}

}

class Dog implements Serializable{

	private transient Collar theCollar;
	private int dogSize;
	
	public Dog(Collar collar, int size){
		theCollar = collar;
		dogSize = size;
	}
	
	public Collar getCollar(){
		return theCollar;
	}
	
	private void writeObject(ObjectOutputStream os){
		try{
			//os.defaultWriteObject();
			os.writeInt(theCollar.getCollarSize());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream is){
		try{
			//is.defaultReadObject();
			theCollar = new Collar(is.readInt());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

class Collar{
	
	private int collarSize;
	
	public Collar(int size){
		collarSize = size;
	}
	
	public int getCollarSize(){
		return collarSize;
	}
	
}

