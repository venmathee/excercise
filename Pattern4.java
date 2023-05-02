/**************************************************Character Pattern
Rita got busy with her customers and she forgot sending the patterns to Sita by mail. Meanwhile, Sita started working on some patterns to gain confidence in using nested loops.
Write a program to generate the pattern using nested for loops.

****

****

****

****

 
Input and Output Format:

Input consists of a single integer, n.

Sample Input :

4
Sample Output :

****

****

****

****
Code:
 
****************************/
import java.util.Scanner;
class Pattern4 {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        
        for(int i=0;i<rows;i++)
      {
          
          for(int j=0;j<rows;j++)   
            {
                System.out.print("*");
            }
             
            System.out.println();
        }
        sc.close();
        
     }
}