package Assignment.Patterns;

import java.util.Scanner;

/* Problem Statement: Print this pattern
                         *
                        **
                       ***
                      ****
                     *****
 */
public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n ; col++) {
                if (col>=n-row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
