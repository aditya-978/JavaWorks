package Assignment.Recursion;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return binary(nums, target, 0, nums.length-1);
    }
    public int binary(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binary(arr,target,mid+1,end);
        } else{
            return binary(arr,target,start, mid-1);
        }
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(bs.search(nums, target));
    }
}