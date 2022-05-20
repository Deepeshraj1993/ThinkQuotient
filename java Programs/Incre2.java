class Incre2
{

public static void main(String[] args)
{
int a=1;
int b=1;
int c=1;

   //2  + 1    + 2
a=++a + b++ + ++c;
  // 5  +  3   + 2
b=a++ + ++b + c++;
  //6   + 10   + 4
c=a++ + b++ + ++c;
System.out.println(a);//7
System.out.println(b);//11
System.out.println(c);//20
}
}