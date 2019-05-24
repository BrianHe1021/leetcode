/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        // check edge case
        if (head == null || head.next == null) {
        	return head;
        }

        ListNode  pre = new ListNode(0);
        ListNode temp = pre;
        pre.next = head;

        while(head != null && head.next != null){
        	ListNode rest = head.next.next;
        	head.next.next = head;
        	head.next = rest;
        	head = head.next.next;

        }

        return temp.next;
    }
}