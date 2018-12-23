#Given a string s, find the longest palindromic substring in s.
def longestPalindrome(s):
		"""
		:type s: str
		:rtype: str
		"""      
		substr = res = 0
		maxlength = 0
		#check whole string is palindromic or not
		if s == s[::-1]:
			print(s)
			return s

		for i in range(len(s)):
			for j in range(len(s)-1,i,-1):
				if s[i]==s[j]:
					substr = s[i:j+1]
					if substr == substr[::-1]:
						if len(substr) > maxlength:
							maxlength = len(substr)
							res = substr
					else:
						substr = 0
		#if no palindromic, just return the first character
		if res == 0:
			print(s[0])
			return s[0]
		else:
			print(res)
			return res
		
longestPalindrome("babad")
#longestPalindrome("bbbbb")