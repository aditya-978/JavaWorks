package Assignment.IntermediatePrograms;

import java.util.Scanner;

//Problem Statement: Java Program to check Vowel Or Consonant
class VowelOrConsonant{
    public VowelOrConsonant(char c){
        switch (Character.toLowerCase(c)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("given character is vowel");
                break;
            default:
                System.out.println("given character is consonant");
                break;
        }
    }
}

//Problem Statement: Java Program to check entered year is a leap year or not
class LeapYear{
    public LeapYear(int year){
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400==0)
                    System.out.println("given year is a leap year");
                else System.out.println("given year is not a leap year");
            } else System.out.println("given year is a leap year");
        }
        else System.out.println("given year is not a leap year");
    }
}

//Problem Statement: Sum Of A Digits Of Number
class SumOfDigits{
    public int sum(int number){
        int rem, ans = 0;
        while(number != 0){
            rem = number%10;
            ans += rem;
            number /= 10;
        }
        return ans;
    }
}

/*
Problem Statement: write a program to print the sum of negative numbers, sum of positive even numbers and the sum of
positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
*/
class Sum{
    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int in = sc.nextInt(), sumOfNegative = 0, sumOfPositiveEven = 0, sumOfPositiveOdd = 0;
        while(in != 0){
            if(in<0) {
                sumOfNegative += in;
                System.out.print("Enter new number: ");
                in = sc.nextInt();
            }
            else if (in % 2 == 0){
                sumOfPositiveEven += in;
                System.out.print("Enter new number: ");
                in = sc.nextInt();
            } else {
                sumOfPositiveOdd += in;
                System.out.print("Enter new number: ");
                in = sc.nextInt();
            }
        }
        System.out.println("Sum of Negative numbers are: "+ sumOfNegative);
        System.out.println("Sum of Positive Even numbers are: "+ sumOfPositiveEven);
        System.out.println("Sum of Positive Odd numbers are: "+ sumOfPositiveOdd);
    }
}

public class Programs {
    public static void main(String[] args) {

        VowelOrConsonant v = new VowelOrConsonant('s');

        LeapYear l = new LeapYear(2100);

        SumOfDigits sumOfDigits = new SumOfDigits();
        System.out.println("Sum of digits is: "+sumOfDigits.sum(31658));

        Sum sumOfNumbers = new Sum();
        sumOfNumbers.sum();
    }
}
