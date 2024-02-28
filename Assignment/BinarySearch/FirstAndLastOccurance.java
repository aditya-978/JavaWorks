package Assignment.BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurance {
    static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        if (nums.length == 0 || target > nums[nums.length-1]){
            return ans;
        }
        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean isFirstIndex) {
        int start = 0, end = nums.length-1, ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target< nums[mid]){
                end = mid-1;
            } else if(target> nums[mid]){
                start = mid +1;
            } else {
                ans = mid;
                if (isFirstIndex)
                    end = mid -1;
                else start = mid+1;
            }
        }
        return ans;
    }
 
    public static void main(String[] args) {
        int nums[] = {}, target = 9;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}