package Assignment.FirstJava;

class Solution2 {
    public boolean isPalindrome(int x){
//        int y = x, r, sum=0;
//        while(x>0){
//            r=x%10;  //getting remainder
//            sum=(sum*10)+r;
//            x=x/10;
//        }
//        if(y == sum)
//            return true;
//        else return false;
        String s=x+"",r="";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        return s.equalsIgnoreCase(r);
    }
}
public class Palindrome {
    public static void main(String[] args) {
//        boolean sol = new Solution2().isPalindrome(4554);
        boolean sol = palindrome("kerala");
        System.out.println(sol);
    }
    static boolean palindrome(String s){
        int start = 0, end = s.length()-1;
        while(start<=end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            } else return false;
        }
        return true;
    }
    }
