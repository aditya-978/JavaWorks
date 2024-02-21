package Assignment.FirstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        float p = in.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float r = in.nextFloat();
        System.out.print("Enter the time: ");
        float t = in.nextFloat();
        System.out.println("Simple Interest is: "+(p*r*t)/100);
    }
}
