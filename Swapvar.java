class Swapvar
{
public static void main(String[] args)
{
System.out.println("Before Swap");

int a=100;
int b=200;
System.out.println(a);
System.out.println(b);
int temp;
temp=a;
a=b;
b=temp;
System.out.println("After Swap");
System.out.println(a);
System.out.println(b);
}
}