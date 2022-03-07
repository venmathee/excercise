import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) {
    
    //write your code here
    int X,rev=0,n;
    Scanner sc=new Scanner(System.in);
    X=sc.nextInt();
    while(X>0){
      n=X%10;
      rev=(rev*10)+n;
      X=X/10;
    }
    System.out.println(+rev);
  }
}
