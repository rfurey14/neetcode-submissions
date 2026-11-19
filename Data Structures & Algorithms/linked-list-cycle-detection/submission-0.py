# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from collections import defaultdict

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        visit = defaultdict(int)
        index = -1
        curr = head
        curr_idx = 0
        while curr:
            if curr in visit.keys():
                index = visit[curr]
                return True  
            else:
                visit[curr] = curr_idx
                curr_idx+=1
                curr = curr.next
        return False
        


        