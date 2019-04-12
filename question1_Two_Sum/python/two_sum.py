'''
Solution1 check every number in the right
Time : O(N) ; Space: O(N)
'''

class Solution1:
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
