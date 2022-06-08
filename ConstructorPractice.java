class A{
	static
	{
		System.out.println("A:static");
	}
	{
		System.out.println("A:init");
	}
	A(){
		System.out.println("A:constructor");
	}
	A(int a){
		this(10,10);
		System.out.println("A int:constructor");
	}
	A(int a, int b){
		System.out.println("A int int :constructor");
	}
}
class B extends A{
	static
	{
		System.out.println("B:static");
	}
	
	{
		System.out.println("B:init");
	}
	
	B(){
		super(10);
		System.out.println("B:constructor");
		System.out.println("B1:constructor");
	}
	B(int a){
		System.out.println("Bint :constructor");
	}
}
/*
class C extends B{
	static
	{
		System.out.println("C:static");
	}
	{
		System.out.println("C:init");
	}
	C(){
		System.out.println("C:constructor");
	}
}
*/
class ConstructorPractice{
	public static void main( String [] args)
	{
		 //C  c = new C();
		B b=new B();
		//A a =new A();
	}
}