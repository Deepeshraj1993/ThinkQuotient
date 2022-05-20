
public class Student {
	String name;
	int age;
	char c;
	String sub;
	int RollNum;
	//Main use to initialize non static variable
	public Student(String s,int a,char c1,String su,int r) {
		name=s;
		age=a;
		c=c1;
		sub=su;
		RollNum=r;
	}
	public void display() {
      System.out.println("[Name="+name+",Age="+age+",Gender="+c+",Subject="+sub+",Rollnum="+RollNum+"]");		
		
	}

public static void main(String[] args) {
	Student s=new Student("Akash", 27, 'M',"Science",524);
	s.display();
}
}
