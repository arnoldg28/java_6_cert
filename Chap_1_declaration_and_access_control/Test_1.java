/*
This is valid and will compile.
Both abstract class and interface has an identical abstract method delaration and a class
extends the abstract class and implements the interface.


*/

abstract class A{

public abstract void same();

}

interface B{

public void same();

}

class Me extends A implements B{

public void same(){

}

}