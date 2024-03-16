package Assignment.Fibonacci;

public class Fibonnaci {
    public static int fibo(int n){
        if (n==1 || n==0){
            return n;
        }
        int nm1 = fibo(n-1);
        int nm2 = fibo(n-2);
        return nm1 + nm2;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fiboFormula(n));
    }

    //Using Formula
    static int fiboFormula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
