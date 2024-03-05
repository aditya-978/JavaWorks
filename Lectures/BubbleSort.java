package Lectures;

/*
Bubble sort is a simple sorting algorithm.
It repeatedly steps through the input list element by element, comparing the current element with the one after it,
swapping their values if needed.

Process of Bubble Sort algorithm:
1) Traverse from left and compare adjacent elements and the higher one is placed at right side.
2) In this way, the largest element is moved to the rightmost end at first.
3) This process is then continued to find the second largest and place it and so on until the data is sorted.

Time Complexity: Best case: O(N) => array is sorted.
                 Worst case: O(N^2) => array is sorted but in reverse order.
*/

import java.util.Arrays;
public class BubbleSort {
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {32,12,43,3,65};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
