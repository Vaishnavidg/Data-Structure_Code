package RECURSION;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 10101;
       int rev =  fun1(n);
       if(n==rev){
           System.out.println(true);
       }else{
           System.out.println(false);
       }
    }
    static int sum=0;
    static int fun(int n){

        if(n%10 ==0) {
            return n;
        }
        int rem = n%10;
        sum = sum*10+ rem;
        fun(n/10);
        return sum;
    }

    static int fun1(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

        static int helper(int n, int digits){
            if(n%10 ==n) {
                return n;
            }
            int rem = n%10;
            return rem*(int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
        }

    }

