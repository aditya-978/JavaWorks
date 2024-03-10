package Lectures.SortingTechniques;

/*
Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time by comparisons.
For every index you are at, put that index element at the correct index of left hand side.

Process:
    1) Iterate over the array and compare the current element (key) to its predecessor.
    2) If the key element is smaller than its predecessor, compare it to the elements before.
    3) Move the greater elements one position up to make space for the swapped element.

Time Complexity: Best case: O(N)
                 Worst case: O(N^2)
*/

import java.util.Arrays;
public class InsertionSort {
    static void insertion(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            for(int j=i+1; j>0;j--){
                if(arr[j]<arr[j-1]){
                    SelectionSort.swap(arr,j,j-1);
                } else break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {92, 50, 5, 20, 11, 22};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}