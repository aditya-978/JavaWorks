package Assignment.Patterns;

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for (int j = 0; j < i*i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}