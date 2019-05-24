/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if (n<=0) {
            return head;
       }

       ListNode first = new ListNode(0);
       first.next = head;
       ListNode pointer = first;

       for (int i = 0; i < n; i++) {
            if (head == null) {
                  return null;
            }
            head = head.next;
       }

       while(head != null){
            pointer = pointer.next;
            head = head.next;
       }

       pointer.next = pointer.next.next;

       return first.next;

    }
}