package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
     int[] arr = {3,1,4,5,2,1};
     bubblesort(arr);
     System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        boolean swapped = false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}
