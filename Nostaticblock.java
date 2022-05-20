
public class Nostaticblock {
 int a;
	public Nostaticblock() {
	System.out.println("Constructor execute");	
	}
	//Non static block(IIB)
	{
		a=456;
		System.out.println("Nonstatic block1 in java");
	}
	//Non static block(IIB)
		{
			a=456;
			System.out.println("Nonstatic block2 in java");
		}
		//Non static block(IIB)
		{
			a=456;
			System.out.println("Nonstatic block3 in java");
		}
	
	
	
	public static void main(String[] args) {
		System.out.println("Main starts");
		Nostaticblock n=new Nostaticblock();
		//Nonstatic initialisation
		//refernece return
		//constructor execute
		//Non static block 
		Nostaticblock n1=new Nostaticblock();
		System.out.println(n1.a);
		System.out.println("Main ends");

	}

}
