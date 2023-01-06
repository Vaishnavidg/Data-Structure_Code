package RECURSION;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 3, 5};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int e, int n) {       //e->element; n->next
        if (e == -1) {
            return;
        }
        if (e > n) {

            if (arr[n] > arr[n + 1]) {
                int temp = arr[n];
                arr[n] = arr[n + 1];
                arr[n + 1] = temp;

            }
            sort(arr, e, n + 1);
        }


    sort(arr, e-1,0);
}

    }

