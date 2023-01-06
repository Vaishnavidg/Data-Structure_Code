package Bitwise_;

public class IthBit {
        public static void main(String[] args) {
            int bit =5;
            int Number = 10110110;
            System.out.println(iBit(Number,bit));
        }
        static int iBit(int number,int n ){
            return number &(1<<(n-1));
        }
}
