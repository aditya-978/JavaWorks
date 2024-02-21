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
        boolean sol = new Solution2().isPalindrome(4554);
        System.out.println(sol);
    }
    }
