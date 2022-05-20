class Strong_number{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();//14
int a=n;
int sum=0;
while(n!=0)
{
int r=n%10;
int i=1;
int p=1;
 while(i<=r)
 {
  p=p*i;
i++;
 }
sum=sum+p;
n/=10;
}

if(sum==a)
{

System.out.println("Number "+a+" is a Strong number");
}
else{
System.out.println("Number "+a+" is not a Strong number");
}

}
}