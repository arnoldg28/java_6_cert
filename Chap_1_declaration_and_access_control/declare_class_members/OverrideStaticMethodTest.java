class Parent{
	static void test(){
	System.out.println("Static Parent");
	}
}

class Child extends Parent{
	static void test(){
	System.out.println("Static Child");
	}
}

class Main{
	public static final void main(String args[]){
	Parent.test();
	Child.test();
	Parent p = new Child();
	p.test();
	Child c = new Child();
	c.test();
	}
}