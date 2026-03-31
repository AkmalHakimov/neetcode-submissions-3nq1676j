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
        if(lists.length == 0 || lists == null) return null;

        return divide(lists, 0, lists.length-1);
    }

    private ListNode divide(ListNode[] lists, int l, int r){
        if(l>r){
            return null;
        }

        if(l == r){
            return lists[r];
        }

        int m = l+(r-l)/2;
        ListNode left = divide(lists, l, m);
        ListNode right = divide(lists, m+1, r);

        return conquer(left, right);
    }

    private ListNode conquer(ListNode l, ListNode r){
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
