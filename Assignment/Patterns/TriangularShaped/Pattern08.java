package Assignment.Patterns.TriangularShaped;

import java.util.Scanner;

/* Problem Statement: Print this pattern
                             *
                            ***
                           *****
                          *******
                         *********
*/
public class Pattern08 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = 0; spaces < n-rows-1; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < (2*rows+1) ; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}