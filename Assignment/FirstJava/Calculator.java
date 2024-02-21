package Assignment.FirstJava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter your operator: ");
        String op = sc.next();

        //using if-else statement
        if (op.equals("+")) {
            System.out.println(num2+num1);
        } else if (op.equals("-")) {
            System.out.println(num2-num1);
        } else if (op.equals("*")) {
            System.out.println(num2*num1);
        } else if (op.equals("/")) {
            if (num2==0)
                System.out.println("cannot divide by zero");
            else System.out.println(num1/num2);
        }else if (op.equals("%")) {
            System.out.println(num1%num2);
        } else {
            System.out.println("Enter correct operator");
        }

        //using switch-case statement
//        switch (op) {
//            case "+" -> System.out.println(num2 + num1);
//            case "-" -> System.out.println(num2 - num1);
//            case "*" -> System.out.println(num2 * num1);
//            case "/" -> {
//                if (num2 == 0)
//                    System.out.println("cannot divide by zero");
//                else System.out.println(num1 / num2);
//            }
//            case "%" -> System.out.println(num1 % num2);
//            default -> System.out.println("Enter correct operator");
//        }
    }
}
