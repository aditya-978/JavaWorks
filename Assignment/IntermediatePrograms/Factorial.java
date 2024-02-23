//calculate the factorial of a number
package Assignment.IntermediatePrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int i = 1;
        long answer = 1;
        while (i<=n){
            answer *= i;
            i++;
        }
        System.out.println("counted normally: "+answer);
        System.out.println("counted through recursion: "+ fact(n));
    }
    static long fact(int n){
        if(n==1|| n==0){
            return 1;
        } else return n*fact(n-1);
    }
}
