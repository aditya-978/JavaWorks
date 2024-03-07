package Assignment.Patterns.UniquesPatterns;

/* Problem Statement: Print this pattern
                                            *
                                         * * * *                     
                                    * * * * * * * * *                
                             * * * * * * * * * * * * * * * *         
                    * * * * * * * * * * * * * * * * * * * * * * * * *
*/

import java.util.Scanner;
public class Pattern36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for (int spaces = 0; spaces < (n*n)-(i*i); spaces++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}