
public class Demo {

	public static void m1() {
		m2();
		System.out.println("m1 method Demo class");
	}
	public static void m2() {
		System.out.println("m2 method in Demo class");
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Main starts");
		m1();
		System.out.println("Main ends");

	}

}
