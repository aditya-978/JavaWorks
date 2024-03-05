package Assignment.Arrays;
// Question link: https://leetcode.com/problems/missing-number/description/
public class MissingNumberInRange {
    public int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex])
                swap(arr, i, correctIndex);
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index)
                return index;
        }
        return arr.length;
    }

    private void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,2,5};
        MissingNumberInRange ms = new MissingNumberInRange();
        System.out.println(ms.missingNumber(arr));
    }
}
