package Lectures.BitwiseOperations;

//Problem Statement: find whether the number given is power of two or not
public class PowerOfTwo {

    public static void main(String[] args) {
        int number = 512;
        boolean ans = number>0 && (number&(number-1)) == 0;
        System.out.println(ans);
    }
}