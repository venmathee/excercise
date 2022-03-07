import java.util.*;
public class fibonacci
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int limit ,first=0,next=1,sum;
System.out.println("enter limit :");
limit=sc.nextInt();
System.out.println("the first" +limit+ "fibonacci series are: " );
for(int i=0;i<limit-1;i++)
{
sum=first+next;
first=next;
next=sum;
System.out.print(+sum+ " ");
}
}
}
