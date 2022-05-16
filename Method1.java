class Method1
{
private static void InterestRate()
{

System.out.println("InterestRate in Method1");
}
public static void main(String[] args)
{
System.out.println("Main starts");
InterestRate();
InterestRate();
InterestRate();
InterestRate();
InterestRate();
Homeloan();

System.out.println("Main ends");
}

protected static void Homeloan()
{
System.out.println("Home loan in Method1");

}
}