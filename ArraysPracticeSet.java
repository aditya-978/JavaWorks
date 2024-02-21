import java.util.Scanner;

public class ArraysPracticeSet {
    public static void main(String[] args) {
        // Problem 1: Create an array of 5 floats and calculate their sum
         float[] numbers = {45.0f, -30.0f, 89.4f, 90, -52.8f};
         float sum = 0;
         for (float element: numbers){
             sum += element;
         }
        System.out.printf("The sum of numbers are "+ sum);
        System.out.println();

        // Problem 2: Check whether number is present in the array or not
        System.out.print("enter number to be checked: ");
        Scanner sc = new Scanner(System.in);
        float checkingNumber = sc.nextFloat();
        boolean check = false;
        for (float element: numbers){
            if(element==checkingNumber){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Element is present in the array.");
        }
        else {
            System.out.println("Element is not present in the array.");
        }

        //Problem 3: Calculate the average
        System.out.println("Average is: " + sum/numbers.length);

        //Problem 4: Calculate the sum of 2 matrices of size 2*3
        /*
        int[][] a = new int[2][3];
        System.out.println("Enter the numbers for matrix 1:");
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int[][] b = new int[2][3];
        System.out.println("Enter the numbers for matrix 2:");
        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[2][3];
        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j < c[i].length ; j++) {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j < c[i].length ; j++) {
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        */

        // Problem 5: Print reverse of an array
        System.out.print("The reversed array of number is: ");
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]+" ");
        }

        // Problem 6: Maximum and minimum in an array
        float max = numbers[0];
        float min = numbers[0];
        for (float number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("\nThe maximum element is: "+max);
        System.out.println("The minimum element is: "+min);

        // Problem 7: Sorting an array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i]<numbers[j]) continue;
                else {
                    float temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.print("The sorted array is: ");
        for (float element: numbers){
            System.out.print(element+" ");
        }
    }
}
