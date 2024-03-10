package Assignment.Arrays;

//Problem statement: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

import static Lectures.SortingTechniques.SelectionSort.swap;

public class FindDisappearedNumbers {
    static List<Integer> disappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else i++;
        }
        List<Integer> list = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if (nums[index] != index+1)
                list.add(index+1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(disappearedNumbers(arr));
    }
}
