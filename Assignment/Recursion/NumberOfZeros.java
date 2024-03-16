package Assignment.Recursion;

public class NumberOfZeros {
    static int countZeros(int number){
        int count = 0;
        return countZerosHelper(number, count);
    }

    static int countZerosHelper(int number, int count) {
        if(number == 0){
            return count;
        }
        if(number%10 == 0){
            count++;
            return countZerosHelper(number/10, count);
        }
        return countZerosHelper(number/10, count);
    }

    public static void main(String[] args) {
        int num = 100005;
        System.out.println(countZeros(num));
    }
}
