// I will not create a public class inside this file.
// Therefore it is legal to set any name for this file.

class A{
	final String a;	
}

class B{
	final String a;
	static{
	a="B";
	}
}

class C{
	static final String a;
	static{
	a= "yes";
	}
}

class D{
	final String a;
	{
	a = "D";
	}
}