package Lectures.SortingTechniques;

/*
In selection sort, the smallest/largest value among the unsorted elements of the array is selected in every pass
and inserted to its appropriate position/correct index in the array.

Process:
    1) Take out the maximum element in the array.
    2) Put it in its correct position i.e. at the end.
    3) Repeat these steps until array is sorted.

Time Complexity: Best case: O(N^2)
                 Worst case: O(N^2)
*/

import java.util.Arrays;
public class SelectionSort {
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last ; i++) {
            if(arr[max]<arr[i])
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {32,12,43,3,65,-5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
