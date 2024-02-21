import java.util.Scanner;

public class MethodsPracticeSet {
    // Problem 1: Multiplication table of a number
    static void table(int n){
        int product = 1;
        for (int i = 1; i <=10 ; i++) {
            product = n*i;
            System.out.println(n+" * "+i+" = "+product);
        }
    }

    // Problem 2: Pattern printing
    static void pattern(int line){
        for (int i = 0; i < line ; i++) {
            for (int j = 0; j < line-i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Problem 3: Recursive function to calculate sum of first n natural number
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);
        System.out.print("Table of number: ");
        int number = scs.nextInt();
        table(number);
        System.out.println();
        System.out.print("Enter number of lines for the Assignment.Patterns.pattern: ");
        int line = scs.nextInt();
        pattern(line);
        System.out.println("Sum of first 10 natural number is: "+sum(10));
    }
}
