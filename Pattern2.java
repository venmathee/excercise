/**********************************************
           Number Pattern - Reverse

Write a program to print the given pattern.
Input Format:
Input consists of a single integer.

Output Format:
Refer sample outputs. There is a trailing space at the end of each line.

Sample Input:
5

Sample Output:

5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
************************************************/
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc = new Scanner(System.in);
         int rows = sc.nextInt();
         for (int i = rows; i >= 1; i--) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        sc.close();
	}

}
