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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;

        PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode list : lists){
            if(list != null){
                heap.offer(list);
            }
        }

        ListNode dummy = new ListNode(0);

        ListNode cur = dummy;

        while(!heap.isEmpty()){
           ListNode node = heap.poll();
           cur.next = node;
            cur = cur.next;

           if(node.next!=null){
             heap.offer(node.next);
           }

        }

        return dummy.next;
    }


}
