package BinarySearch2D;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.toString(findTarget(arr,6)));

    }
    static int[] findTarget(int[][] matrix,int target){
        int r = 0;//lower bond
        int c = matrix.length-1; //upper bond
        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }else{//matrix[r][c](element)>target
                c--;
            }
        }
        return new int[]{-1,-1};

    }
}
