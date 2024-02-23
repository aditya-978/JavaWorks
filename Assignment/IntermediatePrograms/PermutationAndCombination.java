package Assignment.IntermediatePrograms;

import java.util.Scanner;

public class PermutationAndCombination {
    static long factorial(int n){
        if(n==1 || n==0){
            return 1;
        } else return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        if (n<r) {
            System.out.println("wrong input");
            return;
        }
        System.out.println("permutation is: "+ factorial(n)/factorial(r));
        System.out.println("combination is: "+ factorial(n)/(factorial(r)*factorial(n-r)));
    }
}
