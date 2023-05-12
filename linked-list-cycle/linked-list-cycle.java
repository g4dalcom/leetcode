/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Two Pointer
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        
        ListNode walker = head;
        ListNode runner = head;
        
        while (runner != null && runner.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            
            if (walker == runner) return true;
        }
        
        return false;
    }
}

// HashSet
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        
        HashSet<ListNode> hs = new HashSet<>();
        while (head != null) {
            if (hs.contains(head)) return true;
            else {
                hs.add(head);
                head = head.next;
            }
        }
        return false;   
    }
}
