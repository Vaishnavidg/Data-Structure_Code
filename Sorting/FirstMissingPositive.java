package Sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
    int[] arr = {7,8,9,11,12};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr){
        int i=0;
        int arrLength = arr.length;
        while(i<arrLength) { //i<4
            int correctIndex = arr[i]-1;//0
            if ( arr[i]>0 && arr[i] < arrLength && arr[i] != arr[correctIndex] ) {
               swap(arr,i,correctIndex);
            } else {
                //increase i
                i++;

            }
        }

        for(i=0;i<arrLength;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arrLength;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


