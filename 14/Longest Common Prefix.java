//
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) minLen = Math.min(minLen, str.length());
        for (int j = 0; j < minLen; ++j)
            for (int i = 1; i < len; ++i)
                if (strs[0].charAt(j) != strs[i].charAt(j))
                    return strs[0].substring(0, j);
        return strs[0].substring(0, minLen);
    }
}
//
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;

        //check edge case
        if(len==0){
        	return "";
        }

        if (len==1) {
        	return strs[0];
        }

        //check from both side
        int left = 0;
        int right = len-1;

        return dcfunction(strs, left, right);

    }

    private String dcfunction(String[] strs, int left, int right){
    	if (left == right) {
        	return strs[left];
    	}
    	int mid = (left + right)/2;
    	String leftResult = dcfunction(strs, left, mid);
    	String rightResult = dcfunction(strs, mid+1, right);
    	return helper(leftResult, rightResult);
    }
/* This can be improved
    private String helper(String str1, String str2){
    	int len = Math.min(str1.length(), str2.length());
    	String common = "";

    	for (int i =0; i<len; i++) {
    		if (str1.charAt(i) == str2.charAt(i)) {
    			common = common + str1.charAt(i);
    		}
    		
    		if (common = "") {
    			return "";
    		}
    	}

    	return common;
    }
 */
    private String helper(String str1, String str2){
    	int len = Math.min(str1.length(), str2.length());
    	for (int i=0; i<len; i++) {
    		if (str1.charAt(i) != str2.charAt(i)) {
    			return str1.substring(0, i);
    		}
    	}
    	return str1.substring(0, min);
    }
}