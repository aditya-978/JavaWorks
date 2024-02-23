// Calculate the average of N number
package Assignment.IntermediatePrograms;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("for how many number you want to calculate: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("enter "+(i+1)+" number: ");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum/n);
    }
}
