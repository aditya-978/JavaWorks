package Assignment.Recursion;
//Find the given target in the array using linear search.
public class LinearSearch {
    static boolean search(int[] nums, int target, int i) {
        if (nums.length == i) {
            return false;
        }
        if(nums[i]==target){
            return true;
        } else {
            return search(nums, target, i + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(search(a, 8,0));
    }
}