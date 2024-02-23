//Reverse a given string

package Assignment.IntermediatePrograms;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s = sc.next();
        char[] sen = s.toCharArray();
        StringBuilder rev = new StringBuilder();
        for (int i = s.length()-1 ; i >= 0 ; i--) {
            rev.append(sen[i]);
        }
        System.out.println(rev);
    }
}
