package Lectures.BitwiseOperations;

//Problem Statement: Count the number of Set Bits in a given number
public class CountSetBits {
    public static void main(String[] args) {
        int number = 5356;
        System.out.println(Integer.toBinaryString(number));
//        System.out.println(Integer.bitCount(number));      one method is to use the function of Integer class.
        System.out.println(setBits(number));
    }

    static int setBits(int n) {
        int count = 0;
        while(n>0){              // another method is to 'and' the number with number-1 and increase count value.
            count++;
            n = n & n-1;
        }

//        while(n>0){            another method is to 'and' the number with 1 and check it.
//            int last = n&1;
//            if(last == 1)
//                count++;
//            n = n >> 1;
//        }
        return count;
    }
}