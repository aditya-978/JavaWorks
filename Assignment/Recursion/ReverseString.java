package Assignment.Recursion;

public class ReverseString {
    public static void reverseString(char[] s) {
        reverseStringHelper(s, 0, s.length - 1);
        System.out.println(s);
    }

    public static void reverseStringHelper(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverseStringHelper(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        char[] c = {'H','a','n','n','a','h'};
        reverseString(c);
    }
}