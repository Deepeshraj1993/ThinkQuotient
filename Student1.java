
public class Student1 {
	String name;
	int age;
	char c;
	String sub;
	int RollNum;
	//This keyword always refers non static variable of current class/object
	public Student1(String name,int age,char c,String sub,int RollNum) {
		this.name=name;
		 this.age=age;
		this.c=c;
		this.sub=sub;
		this.RollNum=RollNum;
		
		
		
	}
	public void display() {
      System.out.println("[Name="+name+",Age="+age+",Gender="+c+",Subject="+sub+",Rollnum="+RollNum+"]");		
		
	}

public static void main(String[] args) {
	Student1 s=new Student1("Akash", 27, 'M',"Science",524);
	s.display();
}
}
