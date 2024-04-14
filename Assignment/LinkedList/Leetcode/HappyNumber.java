package Assignment.LinkedList.Leetcode;
/*
Q; https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber {
    public boolean isHappy(int num) {
        int slow = num;
        int fast = num;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast!=slow);
        if(slow == 1){
            return true;
        }
        return false;
    }
    private int findSquare(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}