/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode p1 = headA;
//         ListNode p2 = headB;
        
//         while (p1 != p2) {
//             p1 = p1 == null ? headB : p1.next;
//             p2 = p2 == null ? headA : p2.next;
//         }
        
//         return p1;
//     }

public class Solution {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
        int Alength = getLength(headA);
        int Blength = getLength(headB);
        
        while (Alength < Blength) {
            headB = headB.next;
            Blength--;
        }
        
        while (Alength > Blength) {
            headA = headA.next;
            Alength--;
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
    
    public int getLength(ListNode x) {
        int cnt = 0;

        while (x != null) {
            x = x.next;
            cnt++;    
        }

        return cnt;
    }
}
    