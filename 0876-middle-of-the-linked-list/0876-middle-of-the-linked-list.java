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
    public ListNode middleNode(ListNode head) {
        List<Integer> values = new ArrayList<>();
        int headLength = 0;
        while (head != null) {
            values.add(head.val);
            headLength++;
            head = head.next;
        }
        ListNode result = new ListNode();
        ListNode targetNode = result;
        for (int i = headLength / 2, iLimit = values.size(); i < iLimit; ++i) {
            targetNode.val = values.get(i);
            if (i + 1 < iLimit) {
                targetNode.next = new ListNode();
                targetNode = targetNode.next;
            }
        }
        return result;
    }
}