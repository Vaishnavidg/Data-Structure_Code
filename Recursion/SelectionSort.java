package RECURSION;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 3, 5};
        sort(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int e,int n,int max){
        if(e==0){
            return;
        }
        if(e>n){
            if(arr[n]>arr[max]){
                sort(arr,e,n+1,n);
            }else{
                sort(arr,e,n+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[e-1];
            arr[e-1] = temp;
            sort(arr,e-1,0,0);
        }
    }
}
