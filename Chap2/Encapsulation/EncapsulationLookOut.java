//Exam watch

/*
Is the value of right always going to be onethird the value of left? It looks like it will, until you realize that users of the Fooclass 
don’t need to use the setLeft()method! They can simply go straight to the instance 
variables and change them to any arbitrary intvalue.
*/

class Foo{
	public int left = 9;
	public int right = 3;
	
	public void setLeft(int leftNum){
		left = leftNum;
		right = leftNum/3;
	}

}