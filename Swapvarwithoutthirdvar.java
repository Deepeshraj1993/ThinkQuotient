class Swapvarwithoutthirdvar
{
public static void main(String[] args)
{
System.out.println("Before Swap");

int a=100;
int b=200;
System.out.println(a);
System.out.println(b);
a=a+b;
 b=a-b;
 a=a-b;
System.out.println("AfterSwap");
System.out.println(a);
System.out.println(b);
}
}