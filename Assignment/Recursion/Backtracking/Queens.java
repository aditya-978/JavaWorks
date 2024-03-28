package Assignment.Recursion;

/*
    Recurrence relation: T(n) = n * T(n-1) + O(n^2), where n = number of queens
    Time complexity: O(n!)
*/
public class Queens {
    static int queens(boolean[][] board, int row){
        //base cond: when row reaches its limit.
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        //placing the queen and checking for every row and column below it
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    //check whether that position is safe for placing queen or not(checking it's up, diagonal left and diagonal right)
    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check whether it's safe in its above column
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //check for diagonally left side
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i])
                return false;
        }

        //check for diagonally right side
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i])
                return false;
        }

        //if no condition is false, means we are at safe position, therefore return true to place the queen.
        return true;
    }

    //display the final result after placing all the queens at correct position.
    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for (boolean element : row){
                if(element)
                    System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
}