package Lectures.SortingTechniques;

import java.util.Arrays;

public class QuickSort {
    static void quick(int[] number, int low, int high){
        if(low>=high){
            return;
        }
        int start = low, end = high, mid = start+(end-start)/2, pivot = number[mid];
        while(start<=end){
            while(number[start]<pivot){
                start++;
            }
            while(number[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp = number[start];
                number[start] = number[end];
                number[end] = temp;
                start++; end--;
            }
        }
        quick(number,low,end);
        quick(number,start,high);
    }
    public static void main(String[] args) {
        int[] arr = {5,1,2,3,-7,8,-9};
        quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
