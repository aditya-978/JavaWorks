package Assignment.Recursion;

//Check whether the given array is sorted or not.
public class SortedArray {
    static boolean sorted(int[] nums, int i){
        if(nums.length-1 == i){
            return true;
        }
        return nums[i]<nums[i+1] && sorted(nums, i+1);
    }

    public static void main(String[] args) {
        int[] a = {1,2,8,4,5};
        System.out.println(sorted(a, 0));
    }
}
