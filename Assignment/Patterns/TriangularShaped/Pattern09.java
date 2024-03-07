package Assignment.Patterns.TriangularShaped;

import java.util.Scanner;

/* Problem Statement: Print this pattern
                         *********
                          *******
                           *****
                            ***
                             *
*/
public class Pattern09 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int rows = n; rows > 0; rows--) {
            for (int spaces = 1; spaces <= n-rows; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols < (2*rows) ; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}