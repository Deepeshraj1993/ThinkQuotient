
public class create {
	int a1;
	int b;
	//Two members
	//Variable 
	//Method
	//Constructor in java
	//Syntax of constructor
	
	//default constructor
	public create() {
		System.out.println("Constructor in java");
	}
	//parametrised constructor in java
	public create(int a)
	{
		System.out.println("Parametrised constructor a="+a);
	}
	int a;
	public void m1() {
		
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		create c=new create();
		create c1=new create();//JVM calls and execute constructor
		create c2=new create(5);
		c1.m1();
		System.out.println("Main ends");

	}

	

}

