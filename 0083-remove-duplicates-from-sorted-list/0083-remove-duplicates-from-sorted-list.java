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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode prev = head;
        ListNode now = head.next;
        while (true) {
            if (now == null)
                break;
            
            if (prev.val == now.val) {
                prev.next = now.next;
            } else {
                prev = now;
            }
            
            now = now.next;
        }
        
        return head;
    }
}