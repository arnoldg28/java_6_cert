public class OverrideToString{
	
	public static void main(String[] args){
	Bob b = new Bob("GoBobGo", 19);
	System.out.println(b);	
	}
}

class Bob{

int shoeSize;
String nickName;

	Bob(String nickName, int shoeSize){
		this.shoeSize = shoeSize;
		this.nickName = nickName;
	}

	public String toString(){
		return ("I am Bob, but you can call me " + nickName + ". My shoe size is "+shoeSize);
	}

}