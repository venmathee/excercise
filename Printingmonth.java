/***********************************Printing month of the year using switch

Write a program to get the month as integer and year as integer from user and display what month it corresponds and number of days in that month .

INPUT AND OUTPUT CONSTRAINTS :
 Input consists of 2 integers month and year.
 Output consists of name of month and number of days. Output "Invalid Month" if it is not valid.

SAMPLE INPUT AND OUTPUT 1:
Enter the month:
2
Enter the year:
2000
February of 2000 has 29 days.

SAMPLE INPUT AND OUTPUT 2:
Enter the month:
8
Enter the year:
1992
August of 1992 has 31 days.***************************************/
import java.util.*;
class Printingmonth {
    public static void main(String[] args) {
        
            // Fill your code here
         Scanner s=new Scanner(System.in);
        System.out.println("Enter the month:");
        int m=s.nextInt();
        System.out.println("Enter the year:");
        int y=s.nextInt();
        int d;
        if(m>=1 && m<=12)
        {
            switch(m)
            {
                 case 1:
                 d=31;
                 System.out.println("January of "+y+" has "+d+" days.");
                 break;
                 case 2:
                 if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0))
                 d=29;
                 else
                 d=28;
                 System.out.println("February of "+y+" has "+d+" days.");
                 break;
                 case 3:
                 d=31;
                 System.out.println("March of "+y+" has "+d+" days.");
                 break;
                 case 4:
                 d=30;
                 System.out.println("April of "+y+" has "+d+" days.");
                 break;
                 case 5:
                 d=31;
                 System.out.println("May of "+y+" has "+d+" days.");
                 break;
                 case 6:
                 d=30;
                 System.out.println("June of "+y+" has "+d+" days.");
                 break;
                 case 7:
                 d=31;
                 System.out.println("July of "+y+" has "+d+" days.");
                 break;
                 case 8:
                 d=31;
                 System.out.println("August of "+y+" has "+d+" days.");
                 break;
                 case 9:
                 d=30;
                 System.out.println("September of "+y+" has "+d+" days.");
                 break;
                 case 10:
                 d=31;
                 System.out.println("October of "+y+" has "+d+" days.");
                 break;
                 case 11:
                 d=30;
                 System.out.println("November of "+y+" has "+d+" days.");
                 break;
                 case 12:
                 d=31;
                 System.out.println("December of "+y+" has "+d+" days.");
                 break;
                 
            }
        }
        else
        System.out.println("Invalid Month");
     }
}