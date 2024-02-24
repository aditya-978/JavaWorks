package Assignment.Functions;

/* Problem Statement:
Write a program that will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:
        Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail
*/

import java.util.Scanner;

public class School {
    public String grades(int marks){
        String grade = null;
        if (marks >= 91 && marks <= 100)
            grade = "AA";
        else if (marks >= 81 && marks <= 90)
            grade = "AB";
        else if (marks >= 71 && marks <= 80)
            grade = "BB";
        else if (marks >= 61 && marks <= 70)
            grade = "BC";
        else if (marks >= 51 && marks <= 60)
            grade = "CD";
        else if (marks >= 41 && marks <= 50)
            grade = "DD";
        else if (marks <= 40)
            grade = "Fail";
        else System.out.println("Enter correct marks");
        return grade;
    }
    public static void main(String[] args) {
        School school = new School();
//        System.out.println(school.grades(103));
        Scanner sc = new Scanner(System.in);
        System.out.print("for how many subjects you want to check: ");
        int numberOfSubjects = sc.nextInt();
        int i = 1;
        while ( i <= numberOfSubjects) {
            System.out.print("Enter marks for subject "+i+": ");
            int marks = sc.nextInt();
            if (marks>100 || marks<0){
                continue;
            }
            System.out.println("Grade in subject "+i+" is: "+ school.grades(marks));
            i++;
        }
    }
}