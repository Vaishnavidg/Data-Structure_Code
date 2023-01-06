package FIrstChapter;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(chPrime(num));

    }

    // to check the prime number
    static boolean chPrime(int n) {
        if(n==0||n==1){
            return false;
        }
        int i = 2;
        while (i <= (n / 2)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;

    }
}
