
public class Staticvar {

	static String name;
	int a;
	
	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println("Name="+Staticvar.name);
		name="Akash";
		System.out.println("Name="+name);
		name="Shyam";
		System.out.println("Name="+name);
		Staticvar s=new Staticvar();
	     s.a=123;
	     System.out.println("a="+s.a);
	     s.name="Fiza";
	     System.out.println(s.name);

	}

}
