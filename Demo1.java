
public class Demo1 {
	
	
	
	
	static int a;
	//Blocks in Java
	//Static block(SIB)
	static
	{
		a=234;
		System.out.println("static block1 in java class");
		System.out.println(a);
	}
	static
	{
		System.out.println("static block2 in java class");
		
	}
	static
	{
		System.out.println("static block3 in java class");
		
	}
	static
	{
		System.out.println("static block4 in java class");
		
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println("Main ends");

	}

}
