package Lectures.BitwiseOperations;

public class MagicNumbers {
    public static void main(String[] args) {
        int n = 12;
        int a = 5, ans = 0;
        while(n>0){
            int last = n&1;
            n = n>>1;
            ans += last*a;
            a*=5;
        }
        System.out.println(ans);
    }
}
