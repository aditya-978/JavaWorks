package Lectures;

/*
Cycle sort is an in-place sorting algorithm.
The pattern describes an interesting approach to deal problems having arrays containing numbers in a range(0/1 to n).

Process:
    1) All the given array values should be in the range of 1 to N or 0 to N.
    2) If the range is 1 to N, then every array element’s correct position will be the index == value-1.
    3) Means at 0th index value will be 1 and at the 1st index position value will be 2 and so on till nth value.
    4) Similarly for 0 to N values correct index position of each array element or value will be the same as its value.
    5) At 0th index 0 will be there 1st index 1 will be there and so on.

Time Complexity: Worst Case : O(n)
                 Best Case: O(n)
***NOTE***: The array should not be discontinuous.
*/

import java.util.Arrays;

import static Lectures.SelectionSort.swap;

public class CyclicSort {
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i]!= arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,0,2,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}