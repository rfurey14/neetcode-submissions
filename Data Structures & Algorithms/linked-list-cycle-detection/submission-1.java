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
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        int index = -1;
        int curr_idx = 0;
        Map<ListNode, Integer> visit = new HashMap<>();
        while (curr != null) {
            if (visit.containsKey(curr)){
                index = visit.get(curr);
                return true;
            }else{
                visit.put(curr, curr_idx);
                curr = curr.next;
                curr_idx+=1;

            }
        }
        return false;
    }
}
