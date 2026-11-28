/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head.next;
        //until fast pointer hits null or is at the last node
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //at this point, slow will be around the middle
        //slow will represent the END of the first half of the LL

        //start reversing the second half of the LL
        //slow.next represents the START of the second half of the LL
        ListNode secondHalf = slow.next;
        

        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr; 
            curr = next;
        }
        //now build the new list

        ListNode first = head;
        ListNode second = prev;

        while(first != null && second != null){
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;
            first.next = second;
            second.next = firstNext;
            first = firstNext;
            second = secondNext;
        }

        

        
    }
}
