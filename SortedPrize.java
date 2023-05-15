/******************************************Sorted Prize


A customer in the Personalised Gifts Store is awarded a prize when their bill number is a 3-digit number and all the 3 digits are in sorted order. (Examples ---> 379, 256, 973, 652, 225, 522 ...]

                                                                 
Help Gita in identifying the prize winners.

 

Input Format:

Input consists of a number which corresponds to the bill number.

Output Format:
The output consists of a string that is either 'yes' or 'no'. The output is yes when the customer receives the prize and is no otherwise.

 

Sample Input 1:

565

Sample Output 1:

no


Sample Input 2:

620

Sample Output 2:

yes


Sample Input 3:

66

Sample Output 3:

no
********************************************************/
import java.util.*;
public class SortedPrize {
	public static void main(String[] args) {
		//fill your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int last,mid,first;
		if((n>99)&&(n<1000)){
			last=n%10;
			n=n/10;
			mid=n%10;
			first=n/10;
			if((last>=mid)&&(mid>=first)){
				System.out.println("yes");
			}
			else if((last<=mid)&&(mid<=first)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
		else{
			System.out.println("no");
		}
	}
}