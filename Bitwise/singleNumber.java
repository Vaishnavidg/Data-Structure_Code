package Bitwise_;

public class singleNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,4,3,2};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int ans = 0;
        for (int i:arr) {
            ans ^=i;
        }

        return ans;
    }
}
