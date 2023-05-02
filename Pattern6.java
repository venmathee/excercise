/***********************************Flag Pattern 

Write a program to generate the flag pattern given in the sample output. 
 
Input and Output Format:
Input consists of a single integer, n. Assume that “n” should be an odd number.
The number of rows and columns is equal.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
3
Sample Output 1:
 
~ ~ ~ 
~ * ~ 
~ ~ ~
 
Sample Input 2:
7
Sample Output 2:
 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ *  ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
~ ~ ~ ~ ~ ~ ~ 
*********************************************************/
import java.util.*;
class Pattern6 {
    public static void main(String[] args) {
        
            int x;
            Scanner sc = new Scanner(System.in);
            x=sc.nextInt();
            for(int i=x;i>=1;i--){
                for(int j=x;j>=1;j--){
                    if((i==j)&&(i==((x+1)/2))){
                        System.out.print("* ");
                    }else{
                        System.out.print("~ ");
                    }
                    
                }
                System.out.print("\n");
            }
        
     }
}