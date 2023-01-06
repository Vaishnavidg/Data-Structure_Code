package Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int n = 4;
        int[]arr = {0,3,1,2};  //4,0,2,1
        System.out.println(missingNumber(arr,n));

    }
    static int missingNumber(int[] arr, int arrLength){
        int i=0;
        while(i<arrLength) { //i<4
            int correctIndex = arr[i];//0
            if ( arr[i] < arrLength && arr[i] != arr[correctIndex] ) {
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                //increase i
                i++;

            }
        }
        for(i=0;i<arrLength;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arrLength;
    }
}
