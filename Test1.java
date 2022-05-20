

//MultiLevel inheritance

class A{
	void Test() {
		System.out.println("Test A");
	}
	
}
class B extends A{
	void Test1() {
		System.out.println("Test1 B");
	}
}
class C extends B{
	void Test2() {
		System.out.println("Test2 C");
	}
}
public class Test1 {

	public static void main(String[] args) {
		B b= new B();
		b.Test();
		b.Test1();
		C c=new C();
		c.Test1();

	}

}
