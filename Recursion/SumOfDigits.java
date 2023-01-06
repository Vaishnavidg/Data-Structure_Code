package RECURSION;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
        System.out.println(product(13420));
    }
    //Sum of Digits
    static int sum(int n){
        if(n<=0){
            return 0;
        }
        int sum = (n%10) + sum(n/10);
        return sum;
    }
    //Product of Digits
    static int product(int n){
        if(n<=1){
            return 1;
        }
        int prod = (n%10) * product(n/10);
        return prod;
    }
}
