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
        ListNode dummy = new ListNode(0);
        ListNode left = dummy;
        ListNode right = dummy;
        left.next = head;
        
        while (n-- >= 0) {
            right = right.next;
        }
        
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        
        left.next = left.next.next;
        
        return dummy.next;
    }
}