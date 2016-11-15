import java.util.*;

public class WildCardAndSuper{

	public static void addAnimal(List<? super DogForSuperWildCard> animals){
		animals.add(new DogForSuperWildCard());
	}
	
	
	public final static void main(String[] args){
	
		//List<AnimalsForSuperWildCard> animals = new ArrayList<AnimalsForSuperWildCard>();
		List<DogForSuperWildCard> animals = new ArrayList<DogForSuperWildCard>();
		animals.add(new DogForSuperWildCard());
		animals.add(new DogForSuperWildCard());
		
		WildCardAndSuper doc = new WildCardAndSuper();
		doc.addAnimal(animals); // Passing an Animal List
		
	}

}

class AnimalsForSuperWildCard{}
class DogForSuperWildCard extends AnimalsForSuperWildCard {}