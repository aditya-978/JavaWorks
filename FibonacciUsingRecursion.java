import java.util.Scanner;

public class FibonacciUsingRecursion {
    static int n1 =0, n2 = 1, n3;
    static void fibonacciSeries(int n){
        if (n>0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacciSeries(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0) {
            System.out.print("Wrong Entry!");
        } else if (number == 1){
            System.out.print(n1);
        } else if (number == 2) {
            System.out.print(n1 + " "+ n2);
        } else {
            System.out.print(n1 + " "+ n2);
            fibonacciSeries(number-2);
        }
    }
}


