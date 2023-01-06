package Patterns;

/*
Pattern2
 * * * *
 * * * *
 * * * *
 * * * *

Pattern3
* * * *
* * *
* *
*

Pattern4
1
1 2
1 2 3
1 2 3 4

Pattern5
*
* *
* * *
* * * *
* * *
* *
*

Pattern6
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

Pattern 7
    1
   212
  32123
 4321234
543212345

Pattern 8
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1

 Pattern9
0 0 0 0 0 0 0 0 0 0 0
0 1 1 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 2 2 1 0
0 1 2 3 3 3 3 3 2 1 0
0 1 2 3 4 4 4 3 2 1 0
0 1 2 3 4 5 4 3 2 1 0
0 1 2 3 4 4 4 3 2 1 0
0 1 2 3 3 3 3 3 2 1 0
0 1 2 2 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0 0 0

 */
public class Patterns {

    public static void main(String[] args) {
        int a = 4;
        pattern10(4);
    }

    static void pattern2(int a) {
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int a) {
        for (int row = 1; row <= a; row++) {
            for (int col = a - row + 1; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int a) {
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int a) {
        for (int row = 1; row < (2 * a); row++) {

            if (row <=a) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }
//            System.out.println();
            else {
                for (int col = 1; col <= (2 * a) - row; col++) {
                    System.out.print("* ");

                }
            } System.out.println();

        }

    }
    static void pattern5_(int a) {
        for (int row = 1; row <= 2*a; row++) {
            int totalcol = row>a?(2*a-row):row;
            for (int col = 1; col <= totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int a) {
        for (int row = 1; row <= 2*a; row++) {
            int totalcol = row>a?(2*a-row):row;
            int spaces = a-totalcol;
            for(int i =1;i<=spaces;i++){
                System.out.print(" ");
            }

            for (int col = 1; col <= totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int a){
      for(int row = 1;row<=a;row++){
          int spaces = a-row;
          for (int i=1;i<=spaces;i++){
              System.out.print(" ");
          }
          for (int col = row;col>=1;col--){
              System.out.print(col);
          }
          for (int col = 2;col<=row;col++){
              System.out.print(col);
          }
          System.out.println();
      }
    }
    static void pattern8(int a){
        for(int row = 1;row<=2*a;row++){

            int totalcol = row>a?(2*a-row):row;
            int spaces = a-totalcol;
            for (int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            for (int col = totalcol;col>=1;col--){
                System.out.print(col);
            }
            for (int col = 2;col<=totalcol;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern9(int n) {
        int OriginalN = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = OriginalN - Math.min( Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n) {
        int OriginalN = n;
        n = 2*n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int atEveryIndex = OriginalN - Math.min( Math.min(row,col),Math.min(n-row,n-col))+1;
                System.out.print(atEveryIndex+ " ");
            }
            System.out.println();
        }
    }



}



