package Sorting;

import java.util.Arrays;

public class mergeSortInplace {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr, int start, int end ){
        if(end - start==1){
            return;
        }
        int mid = (start+end)/2;

       mergeSortInPlace(arr,start,mid);
       mergeSortInPlace(arr,mid,end);

       merge(arr,start,mid,end);
    }
    static void merge(int[] arr,int s,int m,int e){
        int mix[] = new int[e-s];
        int i=s;
        int j=m;
        int k = 0;
        while(i<m &&j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0;l< mix.length;l++){
            arr[s+l] = mix[l];
        }
        return;
    }
}
