"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        copy_mp = {None : None}
        cur = head
        while cur:
            new_node = Node(cur.val)
            copy_mp[cur] = new_node
            cur = cur.next
        
        cur = head
        while cur:
            copy = copy_mp[cur]
            copy.next = copy_mp[cur.next]
            copy.random = copy_mp[cur.random]
            cur = cur.next
        return copy_mp[head] 

