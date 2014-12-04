public interface InterfaceWithStaticContextTest{
	int x = 0;
	
	//This will not work!
	//The rule in a class is that you can initialized a constant only in declaration or
	//in the static block. But this is an interface. There is no sense for the static 	//block to work since there is no static method to be called in here.
	static{
	 x = 0;
	}
}