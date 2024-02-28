package Assignment.BinarySearch;

public class CeilingOfALetter {
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        if(target>=letters[end])
            return letters[0];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target< letters[mid]){
                end = mid-1;
            } else {
                start = mid +1;
            }
        }
        return letters[start];
    }

    public static void main(String[] args) {
        char[] c = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(c, target));
    }
}
