class Methodoverloading
{
public static int add(int a,int b){
return a+b;
}

public static double add(double d1,double d2){
return d1+d2;
}
public static void main(String[] args)
{

System.out.println("Main starts");
System.out.println("Sum="+add(23,54));

System.out.println("Sum="+add(23.54,54.55));
}
}