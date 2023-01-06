package BinarySearch2D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StrictlySorted {
    public static void main(String[] args) {
    int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
    };
        System.out.println(Arrays.toString(search(arr,6)));
    }
    static int[] binarySearch(int[][] matrix,int row,int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int cMid = cStart+(cEnd-cStart)/2;
            if(matrix[row][cMid]==target){
                return new int[]{row,cMid};
            }
            if(matrix[row][cMid]<target){
                cStart = cMid+1;
            }else{
                cEnd = cMid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length;
        if(row==1){
            return binarySearch(matrix,0,0,col-1,target);
        }
        int rStart = 0;
        int rEnd = matrix.length-1;
        int cMid = col/2;
        // run the loop till two rows are remaining
        while (rStart<rEnd){
            int rMid = rStart+(rEnd-rStart)/2;
            if(matrix[rMid][cMid]==target){
                return new int[]{rMid,cMid};

            }
            if(matrix[rMid][cMid]<target){
                rEnd = rMid;
            }else {
                rStart = rMid;
            }
        }

        //now we have two rows just
        //check whether the target is in remaining two column
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        //remaining four slices
        if (target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        if (target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        if (target >= matrix[rStart][cMid+1]){
            return binarySearch(matrix,rStart,cMid,col-1,target);
        }if (target <= matrix[rStart+1][cMid+1]){
            return binarySearch(matrix,rStart+1,cMid,col-1,target);
        }
        return new int[]{-1,-1};

    }

}
