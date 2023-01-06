package RECURSION;

public class nNumber {
    public static void main(String[] args){
        fun1(5);
    }
    static void fun(int n){
        if(n<=0) {
            return;
        }
        fun(n-1);
        System.out.println(n);

    }
    static void funRev(int n){
        if(n<=0) {
            return;
        }
        System.out.println(n);
        funRev(n-1);

    }
    static void funBoth(int n){
        if(n<=0) {
            return;
        }

        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);

    }
    static void fun1(int n){
        if(n<=0) {
            return;
        }

        System.out.println(n);
        fun1(--n);


    }
}
