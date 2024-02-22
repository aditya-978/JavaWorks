package Assignment.FirstJava;

import java.util.Scanner;

public class TillZero {
    public static void main(String[] args) {
        Sum s = new Sum();
//        s.sum();
        Largest l = new Largest();
        System.out.println(l.large());
    }
}
//Question statement: Take integer inputs till the user enters 0 and print the sum of all numbers using while loop
class Sum {
    public void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int input = sc.nextInt();
        int sum = 0;
        while(input != 0){
            sum += input;
            input = sc.nextInt();
        }
        System.out.println("sum of given numbers are: "+sum);
    }
}

//Question statement: Take integer inputs till the user enters 0 and print the largest number from all.
class Largest {
    public int large() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int input = sc.nextInt();
        int max = input;
        while(input != 0){
            if(input>max)
                max = input;
            input = sc.nextInt();
        }
        System.out.print("maximum among them is: ");
        return max;
    }
}