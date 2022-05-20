class Decre2
{

public static void main(String[] args)
{
int a=1;
int b=1;

    //0  - 1
 a=--a - b--;
  // -1  - -1
b= a-- - --b;
System.out.println(a);//-2
System.out.println(b);//0
}
}
