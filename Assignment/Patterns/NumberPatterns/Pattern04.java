package Assignment.Patterns.NumberPatterns;

import java.util.Scanner;

/* Probelem Statement: Print this pattern
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
 */
public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
