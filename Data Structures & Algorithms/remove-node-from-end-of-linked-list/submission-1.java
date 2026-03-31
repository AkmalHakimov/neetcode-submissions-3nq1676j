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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            List<ListNode> list = new ArrayList<>();

            ListNode cur = head;

            while(cur != null){
                list.add(cur);
                cur = cur.next;
            }

            int removeIndex = list.size() - n;
            if(removeIndex == 0){
                return head.next;
            }

            list.get(removeIndex-1).next = list.get(removeIndex).next;

            return head;
    }
}
