package com.java;

public class AssertionsAtRuntime{

	public final static void main(String[] args){
	
	int a = Integer.parseInt(args[0]);
	
	test(a);
	
	}
	
	private static void test(int a){
	
		assert(a>10): "a = " +a;
		System.out.println("Assertion passed!");
	
	}

}