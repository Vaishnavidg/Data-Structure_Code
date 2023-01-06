package FIrstChapter;

import java.util.Scanner;

//3. Take a number as input and print the multiplication table for it.
public class _3_MulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        mulTable(num);
    }
    static void mulTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
}
