package Assignment.Patterns.StarPatterns;

/* Problem Statement: Print this pattern
                         *
                         **
                         ***
                         ****
                         *****
*/

import java.util.Scanner;

public class Pattern02 {
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
    }
}
