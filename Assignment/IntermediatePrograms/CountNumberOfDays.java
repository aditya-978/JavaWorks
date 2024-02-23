package Assignment.IntermediatePrograms;

/*
Problem Statement: Kunal is allowed to go out with his friends only on the even days of a given month.
Write a program to count the number of days he can go out in the month of August.
 */

import java.util.Scanner;

public class CountNumberOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your month: ");
        String month = scanner.next();
        if (month.equalsIgnoreCase("february"))
            System.out.println("you can go out 14 days");
        else System.out.println("you can go out 15 days");
    }
}