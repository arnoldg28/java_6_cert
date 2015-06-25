class Parent{
	void method1(){
		System.out.println("Parent method 1");
	}
	void method2(){
		System.out.println("Parent method 2");
	}
}

class Child extends Parent{
	void method1(){
		System.out.println("Child method 1");
		super.method2();
	}

	public static void main(String[] args){
		Parent p = new Child();
		p.method1();
	}
}

