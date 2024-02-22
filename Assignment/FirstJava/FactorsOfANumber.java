package Assignment.FirstJava;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Factor of "+ number+" are: ");
        for (int i = 1; i <=number ; i++) {
            if(number%i == 0)
                System.out.print(i + " ");
        }
    }
}
