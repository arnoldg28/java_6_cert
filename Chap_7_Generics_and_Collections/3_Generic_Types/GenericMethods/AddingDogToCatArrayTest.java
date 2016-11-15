import java.util.*;

public class AddingDogToCatArrayTest{

	public final static void main(String[] args){
	
		CatForArray[] cats = {new CatForArray(), new CatForArray()};
		
		iWillAddDogToAnyAnimalArray(cats);
	
	}
	
	public static void iWillAddDogToAnyAnimalArray(AnimalForArray[] animals){
		animals[0] = new DogForArray(); // Will result in ArrayStoreException. Since the array is originally a CatForArray array
	}
	

}

class AnimalForArray{}
class CatForArray extends AnimalForArray{}
class DogForArray extends AnimalForArray{}