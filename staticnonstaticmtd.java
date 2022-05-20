
public class staticnonstaticmtd {
	static String name;
	int age;
	//static method
	public static void details(staticnonstaticmtd s1) {
		name="Siya";
		s1.age=25;
	}
	//Non static Method
	public void details1() {
		name="";
		age=24;
		
	}
public static void main(String[] args) {
		staticnonstaticmtd s=new staticnonstaticmtd();
		details(s);
		s.details1();
		

	}

}
