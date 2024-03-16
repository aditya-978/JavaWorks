package Assignment.Recursion;

public class NumberOfSteps {
    static int steps(int number){
        int count = 0;
        return numberOfSteps(number,count);
    }

    static int numberOfSteps(int number, int count) {
        if(number == 0){
            return count;
        }
        if(number%2==0){
            return numberOfSteps(number/2,count+1);
        }
        return numberOfSteps(number-1, count + 1);
    }

    public static void main(String[] args) {
        System.out.println(steps(123));
    }
}
