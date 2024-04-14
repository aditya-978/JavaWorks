package Assignment.LinkedList.Leetcode;
/*
Q: https://leetcode.com/problems/rotate-list/
Rotate the list in the following form:
Before Rotation: L0 → L1 → L2 → L3 → L4    , k = 2
After k = 1 Rotation: L4 → L0 → L1 → L2 → L3
After k = 2 Rotation: L3 → L4 → L0 → L1 → L2
*/

public class RotateKTimes {
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0 || head == null || head.next == null){
            return head;
        }
        ListNode last = head;
        int length = 1;
        while(last.next!=null){
            last = last.next;
            length++;
        }
        int skip = length-(k%length);
        ListNode newLast = head;
        for (int i = 0; i < skip-1; i++) {
            newLast = newLast.next;
        }
        last.next = head;
        head = newLast.next;
        newLast.next = null;
        return head;
    }
}
