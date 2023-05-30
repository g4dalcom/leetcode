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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode cur;
        
        while (head != null) {
            ListNode newList = head.next;
            
            cur = dummy;
         
            while (cur != null && cur.next != null && cur.next.val < head.val) {
                cur = cur.next;
            }
            
            head.next = cur.next;
            cur.next = head;
            head = newList;
        }
        
        return dummy.next;
    }
}
