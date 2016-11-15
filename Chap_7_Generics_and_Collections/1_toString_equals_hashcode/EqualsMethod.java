public class EqualsMethod{

	public static void main(String[] args){
	
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		
		if(one.equals(two)){
			System.out.println("one and two are equal");
		}
	
	}


}


class Moof{

private int moofValue;

Moof(int value){
	moofValue = value;
}

public int getMoofValue(){
	return moofValue;
}

//Note that it is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.
public boolean equals(Object o){

	if( (o instanceof Moof) && (((Moof)o).getMoofValue() == this.moofValue ) ){
		return true;
	}else{
		return false;
	}

}

}