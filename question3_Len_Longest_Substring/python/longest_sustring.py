#Question3_longest substring without repeating characters#
'''Given a string, find the length of the longest substring without repeating characters.
Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.'''

def lengthOfLongestSubstring(s):
	"""
	:type s: str
	:rtype: int
	"""
	global_max = 0
	non_repeat = []
	max_record = []
	if len(s) == 0:
		return global_max

	for i in range(len(s)):
		if s[i] not in non_repeat:
			non_repeat.append(s[i])
			global_max += 1
			max_record.append(global_max)
		else:
			for x in range(len(non_repeat)):
				if s[i] == non_repeat[x]:
					del non_repeat[0:x+1]
					non_repeat.append(s[i])
					global_max = len(non_repeat)
					max_record.append(global_max)
					break

	global_max = max(max_record)
	print(global_max)
	return global_max

lengthOfLongestSubstring("abcabcbb")