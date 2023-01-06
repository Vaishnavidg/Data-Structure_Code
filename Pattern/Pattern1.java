package Patterns;

/*

 *
 * *
 * * *
 * * * *

 */
public class Pattern1 {
    public static void main(String[] args){
        int a = 4;
        pattern1(a);
    }
    static void pattern1(int a){
        for(int row = 1;row<=a;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
