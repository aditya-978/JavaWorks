package Assignment.BinarySearch;

import java.util.Arrays;

public class BS2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30 ,40},
                {15, 25, 35, 45},
                {18, 29, 39, 50}
        };
        int col = arr.length-1;
        System.out.println(col);
        int target = 4;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0, col = matrix.length;
        while(row< matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            }
            if(matrix[row][col] < target){
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
