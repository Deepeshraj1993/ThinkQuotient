
public class constructoroverloading {
	constructoroverloading(){
		this(44.32,65);
		System.out.println("Constructor with no argument");
	}
	
	constructoroverloading(int a){
		this();//call to this execute immediate constructor based on argument
		System.out.println("Constructor with int argument a="+a);
	}
	
	constructoroverloading(double d,int a){
		System.out.println("Constructor with double and int argument d="+d+",a="+a);
	}
	
	
	
	public static void main(String[] args) {
		
		constructoroverloading c2=new constructoroverloading(22);

	}

}
