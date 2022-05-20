
public class Nonstaticvar {

	
public 	int a;
	int b;
	
	public static void main(String[] args) {
		// to create object of this class
		//Syntax to create object
		Nonstaticvar n=new Nonstaticvar();
		System.out.println("a="+n.a);
		Nonstaticvar n1=new Nonstaticvar();
		n1.a=100;
		n1.b=200;
		System.out.println("a="+n1.a+",b="+n1.b);

	}

}
