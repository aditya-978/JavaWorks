package Assignment.FirstJava;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0)
            System.out.println("The number given is even.");
        else System.out.println("The number given is odd.");
    }
}
