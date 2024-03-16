package Lectures.BitwiseOperations;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6,sum = 0;
        for (int row = 0; row < n; row++) {
            sum = sum + (1<<row);
        }
        System.out.println(sum);
    }
}
