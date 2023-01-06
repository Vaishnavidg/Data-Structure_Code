package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int arr[][] = {{12,3,45,56,3},{34,54,2,1,11},{12,4,5,7,9}};
         int target = 1;
         int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int arr[][],int target){
        for (int i=0;i<arr.length;i++){//arr.length = number of rows
            for (int j=0;j<arr[i].length;j++) {// arr[i].length = no. of columns
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
            }
        return new int[]{-1,-1};
    }
    static int max(int arr[][]){
        int max = arr[0][0];
        for (int i=0;i<arr.length;i++){//arr.length = number of rows
            for (int j=0;j<arr[i].length;j++) {// arr[i].length = no. of columns
                if (arr[i][j] >max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    }

