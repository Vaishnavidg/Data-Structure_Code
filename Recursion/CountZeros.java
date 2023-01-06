package RECURSION;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(fun(30002040,0));
    }
    static int fun(int n, int count){
        if(n==0){
            return count;
        }
        int digit = n%10;
        if(digit ==0){
            return fun(n/10,count+1);
        }
            return fun(n / 10, count);

    }
}
