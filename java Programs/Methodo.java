class Methodo
{
public static void add(int a,int b){
System.out.println("Sum="+(a+b));
}
public static void add(int a,int b,int c){
System.out.println("Sum="+(a+b+c));
}
public static void add(double d1,double d2){
System.out.println("Sum="+(d1+d2));
}
public static void main(String[] args)
{

System.out.println("Main starts");
add(23,54);
add(54,65,78);
add(453.54,353.54);
System.out.println("Main ends");
}

}