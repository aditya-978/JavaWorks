package Assignment.LinkedList.Leetcode;
/*
Q: https://leetcode.com/problems/reorder-list/
Reorder the list in the following form:
Before ReOrder: L0 → L1 → L2 → L3 → ... → Ln - 3 → Ln-2 → Ln - 1 → Ln
After ReOrder: L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 */
public class Reorder {
        public void reorderList(ListNode head) {
            if(head == null || head.next == null){
                return;
            }
            ListNode mid = middleNode(head);
            ListNode hs = reverseList(mid);
            ListNode hf = head;

            while ((hf != null && hs != null)) {

                ListNode temp = hf.next;
                hf.next = hs;
                hf = temp;
                temp = hs.next;
                hs.next = hf;
                hs = temp;
            }
            if (hf!=null){
                hf.next = null;
            }

        }

        public ListNode middleNode(ListNode head){  //returns the middle element of the linked list.
            ListNode fast = head;
            ListNode slow = head;
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        public ListNode reverseList(ListNode head){  //returns a reversed list
            if(head==null){
                return head;
            }
            ListNode prev = null;
            ListNode present = head;
            ListNode next = (present != null) ? present.next : null;
            while (present!=null){
                present.next = prev;
                prev = present;
                present = next;
                if(next != null){
                    next = next.next;
                }
            }
            return prev;
        }
    }

