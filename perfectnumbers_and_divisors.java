import java.util.Scanner;

public class perfectnumbers_and_divisors{
public static void main(String args[]) { 
Scanner sc=new Scanner(System.in);
System.out.println("enter no of test cases");
int T=sc.nextInt();
for(int k=0;k<T;k++)
{
int n,sum=0;
n=sc.nextInt();
{
for(int i=1;i<n;i++)

if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
System.out.println("true");
else
System.out.println("false");
}
}}
