package Assignment.Patterns.StarPatterns;

import java.util.Scanner;

/* Problem Statement: Print this pattern
                          *
                          **
                          ***
                          ****
                          *****
                          ****
                          ***
                          **
                          *
 */
public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <=row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row < n; row++) {
            for (int col = n; col > row ; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
