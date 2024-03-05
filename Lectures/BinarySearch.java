package Lectures;
/*
Binary search is one of the searching techniques applied when the input is sorted.
Here we are focused on finding the middle element that acts as a reference frame whether to go left or right.
This helps in optimizing the search technique with every iteration.
*/
public class BinarySearch {
    static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (target < arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={1,4,8,12,18,25,34,55};
        int target = 55;
        System.out.println(binarySearch(arr,target));
    }
}
