class  Prime_number{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();
int a=1;
for(int i=2;i<n/2;i++)
{
   if(n%i==0)
    {
     a=0;
      break;
     }
}
if(a==1)
{
System.out.println("Number "+n+ " is a prime number");
}else{
System.out.println("Number "+n+ " is not a prime number");
}





}
}