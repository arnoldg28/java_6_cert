class ClassName{
	
/*

	//Practice 1 valid


	public ClassName(){}
	//Valid method name but misleading.
	public void ClassName(){}

*/

/*
//Compile Error. modifier static not allowed here.
public static ClassName(){}
*/

/*
//Compile error.modifier final not allowed here.
public final ClassName(){}
*/

//Compile error abstract not allowed here.
public abstract ClassName();

}