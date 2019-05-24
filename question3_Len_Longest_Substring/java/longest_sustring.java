package question3_Len_Longest_Substring.java;
import java.util.HashSet;
import java.util.Set;

class Solution{
	public static int lengthOfLongestSubstring(String s){
		int len = s.length();
		int max = 0;
		int left = 0;
		int right = 0;
		Set<Character> set = new HashSet<>();
		
		if (s==null || len == 0) {
			return 0;
		}
		
		while(right < len) {
			if(set.add(s.charAt(right))) {
				right++;
				max = Math.max(max, right-left);
			}else {
				set.remove(s.charAt(left));
				left++;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		String input = "abcabcbb";
		int result = lengthOfLongestSubstring(input);
		System.out.println(result);
	}
		
}