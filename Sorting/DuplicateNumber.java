package Sorting;

public class DuplicateNumber {
    public static void main(String[] args) {
      int[] arr = {1,3,4,2,2};
        System.out.println(duplicateNumber(arr));
    }
    static int duplicateNumber(int[] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex =  arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        for (int index = 0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return arr[index];
            }
        }
        return -1;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
