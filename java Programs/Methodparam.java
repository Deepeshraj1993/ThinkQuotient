class Methodparam
{

public static void methodname1(int a)//parameter
{
System.out.println("Methodname1 in class Method1 a="+a);

}
public static void methodname2(int a,double d)//parameter
{
System.out.println("Methodname1 in class Method1 a="+a+",d="+d);

}
public static void main(String[] args)
{

System.out.println("Main starts");
methodname1(34);//argument
methodname2(154,6543.345);
System.out.println("Main ends");

}
}