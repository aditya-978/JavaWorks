package Assignment.Patterns.TriangularShaped;

import java.util.Scanner;

/* Problem Statement: Print this pattern
                         *********
                          *     *
                           *   *
                            * *
                             *
 */
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int spaces = n-i; spaces >= 1; spaces--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * i - 1; col++) {
                if (col == 1 || col == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
