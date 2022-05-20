class Scanner2
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter Your Name");
String name=scn.next();
System.out.println("Enter your age");
int age=scn.nextInt();
System.out.println("Enter your Gender");
char c=scn.next().charAt(0);
System.out.println("Name="+name+",Age="+age+",Gender="+c);
}
}