package BackTracking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintMatrixAndPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        pathMatrix("",0,0,board,path,1);
    }
    static void pathMatrix(String p ,int r,int c,boolean[][] maze,int[][] path,int step){
        if(r==maze.length-1 && c== maze[0].length-1){
            path[r][c] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if(r<maze.length-1){
            pathMatrix(p+"D",r+1,c,maze,path,step+1);
        }
        if(c<maze.length-1){
            pathMatrix(p+"R",r,c+1,maze,path,step+1);
        }
        if(r>0){
            pathMatrix(p+"U",r-1,c,maze,path,step+1);
        }
        if(c>0){
            pathMatrix(p+"L",r,c-1,maze,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
