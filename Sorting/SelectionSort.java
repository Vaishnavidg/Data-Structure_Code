package Sorting;

import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max = getMaxIndex(arr,0, last);
            swap(arr, max,last);
        }
    }
    static int getMaxIndex(int[] arr, int start,int last){
        int max = start;
        for(int i =0;i<=last;i++){
            if(arr[max]<arr[i]){
                max = i;

            }
        }
        return max;
    }
    static void swap(int[] arr,int max,int last){
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }

        }