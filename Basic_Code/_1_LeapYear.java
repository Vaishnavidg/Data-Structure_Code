package FIrstChapter;
import java.util.Scanner;


//Input a year and find whether it is a leap year or not.
public class _1_LeapYear {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the year");
        int year = sc.nextInt();
        if(year%400==0){
            System.out.printf(year +" is Leap Year.");
        }else if (year%100==0){
            System.out.printf(year+ " is not Leap Year");
        }else if (year %4 ==0){
            System.out.printf(year+ " is Leap Year.");
        }
        else {
            System.out.printf(year+ " is Not Leap Year");
        }
    }
}
