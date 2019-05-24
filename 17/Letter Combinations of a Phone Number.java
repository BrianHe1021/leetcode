class Solution {
    public List<String> letterCombinations(String digits) {
    	List<String> list = new ArrayList<>();

    	//check edge case
    	if (digits.length() == 0) {
    		return list;
    	}
    	helper(list, digits, "");
        return list;
    }

    private void helper(List<String> list, String digits, String ans) {
        String[] map = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (ans.length() == digits.length()) {
            list.add(ans);
            return;
        }
        for (char c : map[digits.charAt(ans.length()) - '2'].toCharArray()) {
            helper(list, digits, ans + c);
        }
    }
}