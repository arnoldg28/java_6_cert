//This is Valid a var-arg can accept an array

class VarArgTest{

public void varArg(int... x){

}

public static final void main(String[] args){
	VarArgTest t = new VarArgTest();
	int[] a = new int[3];
	t.varArg(a);

}


}