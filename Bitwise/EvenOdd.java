package Bitwise_;

//Q. Find the number is odd or not
public class EvenOdd {
    public static void main(String[] args) {
        int n =60;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n&1)==1;
    }
}
