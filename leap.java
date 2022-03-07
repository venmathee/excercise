import java.util.Scanner;
class leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
int N[]=new int[T];

for(int i=0;i<T;i++)
{
  N[i]=sc.nextInt();
}
for(int j=0;j<T;j++)
{
  if((N[j] % 4 == 0 && N[j] % 100!= 0) || N[j] % 400==  0){
       System.out.println("Yes");
  }
  else {
      System.out.println("No");
  }
}
}
}
    
