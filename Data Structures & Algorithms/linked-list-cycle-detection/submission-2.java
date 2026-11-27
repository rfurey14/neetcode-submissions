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
        int index = -1; 
        int currIndex = 0; 
        HashMap<ListNode, Integer> visited = new HashMap<>();
        ListNode curr = head;
        while(curr != null){
            if(visited.containsKey(curr)){
                index = visited.get(curr);
                return true;
            }
            visited.put(curr, currIndex);
            curr = curr.next;
            currIndex++;
        }
        return false;
        
    }
}
