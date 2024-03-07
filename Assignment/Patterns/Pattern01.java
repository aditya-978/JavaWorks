package Assignment.Patterns;

import java.util.Scanner;

/* Problem Statement: Print this pattern
                             *****
                             *****
                             *****
                             *****
                             *****
*/
public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
