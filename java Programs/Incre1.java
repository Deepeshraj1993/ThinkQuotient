class Incre1
{

public static void main(String[] args)
{
int a=1;
int b=1;

      
   a=++a + ++b; 
   b=a++ + b++;
System.out.println("a="+a);//5
System.out.println("b="+b);//6
}
}