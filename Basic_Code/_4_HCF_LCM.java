package FIrstChapter;


import java.util.Scanner;

//4.Take 2 numbers as input and find their HCF and LCM.
public class _4_HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        hcflcm(num1,num2);
    }
    static void hcflcm(int n1,int n2){
        int temp;
        int temp1 = n1;
        int temp2 = n2;
        while (temp2 !=0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }
        int hcf = temp1;
        System.out.println("HCF of numbers is "+hcf);
        int lcm = (n1*n2)/hcf;
        System.out.println("LCM of numbers is "+lcm);
    }
}
