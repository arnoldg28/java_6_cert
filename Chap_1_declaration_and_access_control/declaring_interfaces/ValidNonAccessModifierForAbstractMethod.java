interface TestValidNonAccessModifier{
//interface method are implicitly public and abstract

	strictfp void test1(); //Not allowed. Compile error.
	
	synchronized void test(); //Not allowed. Compile error.
	
	///but this is valid in abstract classes.
	protected abstract void test();
}