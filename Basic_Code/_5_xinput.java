package FIrstChapter;

import java.util.Scanner;
// 5.Keep taking numbers as input till the user enter 'x',after that print sum of all.
public class _5_xinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int num;
        String ch;
        ch = sc.next();
        while(ch!= "x"){
            num = sc.nextInt();
            sum = sum+num;
        }
        System.out.printf("Sum of all numbers "+sum);
    }
}
