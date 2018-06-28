'''Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].'''

class Solution:
	def twoSum(self, nums, target):
		"""
		:type nums: List[int]
		:type target: int
		:rtype: List[int]
		"""
		for a in (range(len(nums))):
			b=target-nums[a]
			if b in nums[a+1:]:
				print([a,nums[a+1:].index(b)+a+1])
 
'''Testcase'''
'''Testcase1_normalCase'''
nums1 = [2, 5, 5, 4, 6, 3, 1, 2, 34, 1, 2]
target1 = 10
case1 = Solution()
case1.twoSum(nums1, target1)
