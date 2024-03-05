package Assignment.Arrays;
// Problem statement: https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    public int missingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1)
                return index+1;
        }
        return nums.length+1;
    }

    private void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        FirstMissingPositive fms = new FirstMissingPositive();
        System.out.println(fms.missingPositive(arr));
    }
}
