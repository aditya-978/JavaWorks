package Assignment.Arrays;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[nums[i]];
//        }
        aPermutation(nums,0);
        System.out.println(Arrays.toString(nums));
    }
    static void aPermutation(int[] nums,int start)
    {
        if(start<nums.length)
        {
            int temp=nums[start];
            int result=nums[temp];
            aPermutation(nums,start+1);
            nums[start]=result;
        }
    }
}