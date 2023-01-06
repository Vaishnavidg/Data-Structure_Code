package BackTracking;

public class N_Queens {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }

    // return number of ways
    static int queens(boolean[][] board,int r){
        if(r == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        //placing the queen
        for (int c = 0;c<board.length;c++){
            //place the queen if it is safe
            if(isSafe(board,r,c)){
                board[r][c] = true;
                count += queens(board,r+1);
                board[r][c] = false;
            }

        }

        return count;
    }

   static boolean isSafe(boolean[][] board, int r, int c) {
        //check vertical row
       for(int i =0;i<r;i++){
           if(board[i][c]){
               return false;
           }
       }
       //diagonal left
       int Maxleft = Math.min(r,c);
       for (int i=1;i<=Maxleft;i++){
           if(board[r-i][c-i]){
               return false;
           }
       }
       //diagonal right
       int MaxRight = Math.min(r,board.length-c-1);
       for (int i=1;i<=MaxRight;i++){
           if(board[r-i][c+i]){
               return false;
           }
       }
       return true;


    }


    private static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q");
                }
                else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
