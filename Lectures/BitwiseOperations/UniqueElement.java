package Lectures.BitwiseOperations;

public class UniqueElement {
    static int ans(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique^=n;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,3,4,5,4,2,1,5,6,3};
        System.out.println(ans(arr));
    }
}
