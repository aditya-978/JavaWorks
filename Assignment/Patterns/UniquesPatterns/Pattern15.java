package Assignment.Patterns.UniquesPatterns;

import java.util.Scanner;

/* Problem statement: Print this pattern
                             *
                            * *
                           *   *
                          *     *
                         *       *
                          *     *
                           *   *
                            * *
                             *
*/
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n-i; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * i - 1; col++) {
                if (col == 1 || col == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int spaces = n-i; spaces >= 1; spaces--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * i - 1; col++) {
                if (col == 1 || col == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
