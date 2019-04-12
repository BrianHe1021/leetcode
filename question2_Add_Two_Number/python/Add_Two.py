'''You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.'''
'''Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.'''

# Definition for singly-linked list.
class ListNode:
	 def __init__(self, x):
		 self.val = x
		 self.next = None

class Solution:
	def helper(self, num):
		if num.next == None:
			return num.val
	
		return self.helper(num.next) * 10 + (num.val)
	
	def addTwoNumbers(self, l1, l2):
		"""
		:type l1: ListNode
		:type l2: ListNode
		:rtype: ListNode
		"""
		sum = self.helper(l1) + self.helper(l2)
		temp = sum

		head = ListNode(temp % 10)
		copyHead = head
		temp = temp // 10

		while temp != 0:
			head.next = ListNode(temp % 10)
			head = head.next
			temp = temp // 10

		return copyHead