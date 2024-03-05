package Assignment.Arrays;

import java.util.Arrays;

//Problem statement: https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    public static int[] findErrorNums(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex])
                swap(arr, i, correctIndex);
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1)
                return new int[]{arr[index], index+1};
        }
        return new int[]{-1,-1};
    }

    private static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
