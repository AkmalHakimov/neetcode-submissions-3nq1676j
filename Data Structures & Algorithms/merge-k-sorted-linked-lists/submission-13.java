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
        if(lists.length == 0){
            return null;
        }

        while(lists.length > 1){
             List<ListNode> mergedList = new ArrayList<>();

          for(int i = 0; i < lists.length; i +=2){

             ListNode l1 = lists[i];
             ListNode l2 = (i+1) < lists.length ? lists[i+1] : null;

             mergedList.add(mergeList(l1,l2));

             
          }  
          lists = mergedList.toArray(new ListNode[0]);
        }

        return lists[0];
    }

    private ListNode mergeList(ListNode l, ListNode r){
        ListNode dummy = new ListNode(0);

        ListNode cur = dummy;

        while(l != null && r != null){
            if(l.val <= r.val){
                cur.next = l;
                l = l.next;
            }else{
                cur.next = r;
                r = r.next; 
            }
            cur = cur.next;
        }

        if(l != null){
            cur.next = l;
        }

        if(r != null){
            cur.next = r;
        }

        return dummy.next;
    }


}
