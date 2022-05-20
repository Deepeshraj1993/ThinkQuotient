class Methodreturnvalue
{

public static String Studentdetails(String name)
{

return name;
}
public static int add(int a,int b)
{

return a+b;
}
public static void main(String[] args)
{
System.out.println("main starts");
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter name");
 String n=scn.next();
    String s=Studentdetails(n);
System.out.println("Name:-"+s);
System.out.println("Enter 1st value");
int a=scn.nextInt();
System.out.println("Enter 2nd value");
int b=scn.nextInt();
int sum=add(a,b);
  System.out.println("The sum of "+a+" & "+b+" is "+sum);
System.out.println("main ends");
}
}
