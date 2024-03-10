package Lectures.BitwiseOperations;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 7641245;
        if(isOdd(n)){
            System.out.println("Number is Odd.");
        } else{
            System.out.println("Number is Even.");
        }
    }

    private static boolean isOdd(int n) {
        return (n&1) == 1;
    }
}
