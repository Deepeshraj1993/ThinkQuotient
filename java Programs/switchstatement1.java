class  switchstatement1{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter operation");
String Oper=scn.next();
System.out.println("Enter 1st");
int a=scn.nextInt();
System.out.println("Enter 2nd");
int b=scn.nextInt();
//Syntax to use Switch case statement

switch(Oper)
{
     case "add": 
            System.out.println("Sum of "+a+ " and "+b+ " is "+(a+b));
            break;
 case "sub": 
            System.out.println("Substraction of "+a+ " and "+b+ " is "+(a-b));
            break;
 case "mul": 
            System.out.println("Multiple of "+a+ " and "+b+ " is "+(a*b));
            break;
 case "div": 
            System.out.println("Div of "+a+ " and "+b+ " is "+(a/b));
            break;
          






}

}
}