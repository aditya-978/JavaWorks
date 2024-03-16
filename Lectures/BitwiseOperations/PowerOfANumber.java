package Lectures.BitwiseOperations;

//Problem Statement: Calculate a^b
public class PowerOfANumber {
    public static void main(String[] args) {
        int a = 4, b = 5, ans = 1;
        while(b>0){
            int last = b & 1;
            if(last == 1){
                ans *= a;
            }
            a *= a;
            b=b>>1;
        }
        System.out.println(ans);
    }
}
