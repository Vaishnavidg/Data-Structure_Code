package LinearSearch;


//Find the numbers with Even Number of digits

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(123456));
        System.out.println(even(2456));
        System.out.println(digits2(1233));
    }
    static int findNumbers(int[] arr){
        int count = 0;
        for(int num: arr){
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int noOfDigits = digits(num);
        if(noOfDigits%2==0){
            return true;
        }
        return false;
    }

    static int digits2(int num){
        return (int)(Math.log10(num))+1;
    }
    static int digits(int num) {
        int cnt = 0;
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
        while(num>0){
            cnt++;
           num =  num/10;
        }
        return cnt;
    }
}
