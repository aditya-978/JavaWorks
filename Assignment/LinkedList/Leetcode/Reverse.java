package Assignment.LinkedList.Leetcode;
/*
Q: https://leetcode.com/problems/reverse-linked-list/
Reverse the list in the following form:
Before Reverse: L0 → L1 → L2 → L3 → L4
After Reverse: L4 → L3 → L2 → L1 → L0
*/

public class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode past = null;
        ListNode present = head;
        ListNode future = (present != null) ? present.next : null;
        while(present != null){
            present.next = past;
            past = present;
            present = future;
            if(future != null){
                future = future.next;
            }
        }
        return past;
    }
}
