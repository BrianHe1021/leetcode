/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // check edge case
        if (lists.length == 0) {
        	return null;
        }
        if (lists.length == 1) {
        	return lists[0];
        }

        // divide and conquer
        return merge(lists, 0, lists.length -1);
    }

    private ListNode merge(ListNode[] lists, int left, int right){
    	if (left == right) {
    		return lists[left];
    	}
    	int mid = (left + right)/2;
    	ListNode leftNode = merge(lists, left, mid);
    	ListNode rightNode = merge(lists, mid+1, right);

    	ListNode head = new ListNode(0);
    	ListNode temp = head;

    	while(leftNode != null && rightNode != null){
    		if (leftNode.val < rightNode.val) {
    			temp.next = leftNode;
    			leftNode = leftNode.next;
    		}else{
    			temp.next = rightNode;
    			rightNode = rightNode.next;
    		}
    		temp = temp.next;
    	}

    	temp.next = leftNode != null ? leftNode : rightNode;

    	return head.next;

    }
}