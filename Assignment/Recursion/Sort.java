package Assignment.Recursion;

import java.util.Arrays;

public class Sort {
    static void bubble(int[] arr, int i, int j){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
            }
            bubble(arr,i,j+1);
        }
        bubble(arr, i-1,0);
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    static void selection(int[] arr, int i){
        if(i==0){
            return;
        }
        int start = 0;
        int maxIndex = getMax(arr,start,i);
        swap(arr,maxIndex,i);
        selection(arr,i-1);
    }
    static int getMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last ; i++) {
            if(arr[max]<arr[i])
                max = i;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {6,4,3,9,2,8,1,5,7};
//        bubble(arr, arr.length-1, 0);
        selection(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
