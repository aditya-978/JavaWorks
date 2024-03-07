package Assignment.Patterns;

/* Problem Statement: Print this pattern
                         *****
                         ****
                         ***
                         **
                         *
 */

import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = n; col > row ; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
