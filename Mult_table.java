/****************************************Multiplication Table

 Write a program to print the multiplication table of an integer n up to m rows using a while loop.

Input Format:

Input consists of 2 integers. The first integer corresponds to n. The second integer corresponds to m.

Output Format:

Refer Sample Input and Output for formatting specifications.

 Sample Input and Output:

Enter n

5

Enter m

4

The multiplication table of 5 is

1*5=5

2*5=10

3*5=15

4*5=20
*******************************************/
cimport java.util.*;
class Mult_table {
    public static void main(String[] args) {
        
            // Fill your code here
             Scanner s=new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();
        System.out.println("Enter m");
         int m=s.nextInt();
        int i=1,j=1;
         System.out.println("The multiplication table of "+n+" is");
        while(i<=m)
        {
            j=i*n;
            System.out.println(i+"*"+n+"="+j);
            i++;
        }
        
     }
}