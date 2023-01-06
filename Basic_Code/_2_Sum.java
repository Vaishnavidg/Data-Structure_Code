package FIrstChapter;
import java.util.Scanner;

//2. Take two numbers and print the sum of both.
public class _2_Sum {
    public static void main(String[] args) {
        System.out.printf("Enter two numbers: ");
        Scanner sc  =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("Sum of two numbers is "+sumNum(num1,num2));
    }
    static int sumNum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
