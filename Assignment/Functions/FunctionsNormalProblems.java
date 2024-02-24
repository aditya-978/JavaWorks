package Assignment.Functions;

import java.util.Scanner;

public class FunctionsNormalProblems {

/*
Problem Statement: Define two methods to print the maximum and the minimum number respectively
                   among three numbers entered by the user.
*/
    int max(int a, int b, int c){
        return Math.max(c,Math.max(a,b));
    }
    int min(int a, int b, int c){
        return Math.min(c,Math.min(a,b));
    }

//Problem Statement: Program to find out whether a given number is even or odd.
    void evenOrOdd(int number){
        if(number%2==0)
            System.out.println("number is even.");
        else System.out.println("number is odd.");
    }

//Problem Statement: Define a method to find out if he/she is eligible to vote.
    void vote(int age){
        if(age >= 18)
            System.out.println("Eligible to vote.");
        else System.out.println("Not Eligible to vote");
    }

//Problem Statement: Program to print the sum and product of two numbers entered by user by defining your own method.
    static void maths(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("The sum of given number is: "+ (num1+num2));
        System.out.println("The product of given number is: "+ num1*num2);
    }

    public static void main(String[] args) {
        System.out.println(new FunctionsNormalProblems().min(12,5,96));
        System.out.println(new FunctionsNormalProblems().max(65,43,78));
        new FunctionsNormalProblems().evenOrOdd(5610);
        maths();
    }
}