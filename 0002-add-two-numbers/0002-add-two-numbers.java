import java.math.BigInteger;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<String> L1 = new LinkedList<>();
        LinkedList<String> L2 = new LinkedList<>();
        while (!Objects.isNull(l1) || !Objects.isNull(l2)) {
            if (!Objects.isNull(l1)) {
                L1.addFirst(Integer.toString(l1.val));
                l1 = l1.next;
            }
            if (!Objects.isNull(l2)) {
                L2.addFirst(Integer.toString(l2.val));
                l2 = l2.next;
            }
        }
        BigInteger L1Value = new BigInteger(String.join("", L1));
        BigInteger L2Value = new BigInteger(String.join("", L2));
        BigInteger resultVal = L1Value.add(L2Value);
        String[] resultValByStrArr = resultVal.toString().split("");

        ListNode result = new ListNode();
        ListNode target = result;
        for (int i = resultValByStrArr.length - 1, iLimit = 0; i >= iLimit; --i) {
            target.val = Integer.parseInt(resultValByStrArr[i]);
            if (i != 0) {
                target.next = new ListNode();
                target = target.next;
            }
        }
        return result;
    }
}