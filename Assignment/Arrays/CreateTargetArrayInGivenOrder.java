package Assignment.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1}, target = new int[nums.length];
        ArrayList<Integer> arr = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(target));
    }
}