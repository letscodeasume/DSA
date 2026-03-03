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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode returnnode = new ListNode(Integer.MIN_VALUE);
        ListNode headnode = returnnode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                returnnode.next = l1;
                l1 = l1.next;
            } else {
                returnnode.next = l2;
                l2 = l2.next;
            }
            returnnode = returnnode.next;
        }
        if (l1 == null) {
            returnnode.next = l2;
        } else if (l2 == null) {
            returnnode.next = l1;
        }
        return headnode.next;

    }
}