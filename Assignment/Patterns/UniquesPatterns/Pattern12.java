package Assignment.Patterns.UniquesPatterns;

import java.util.Scanner;

/* Problem Statement: Print this pattern
                         * * * * * *
                          * * * * *
                           * * * *
                            * * *
                             * *
                              *
                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *
*/
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int rows = n; rows > 0; rows--) {
            for (int spaces = 1; spaces <= n-rows; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < rows ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 0; spaces < n-rows; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < rows ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}