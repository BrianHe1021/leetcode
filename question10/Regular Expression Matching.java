class Solution {
    public boolean isMatch(String s, String p) {
    	// check edge case
    	if (p.isEmpty()) {
    		return s.isEmpty();
    	}

    	// when s and p only have one char
    	if ( p.length() == 1) {
    		return  s.length() == 1 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');
    	}

    	// more than one char and the second char is not *
    	if (p.charAt(1) != '*') {
    		if (s.isEmpty()) {
    			return false;
    		}
    		return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.' ) && isMatch(s.substring(1), p.substring(1));
    	}

    	// the second char is *
    	while (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.' )){
    		if (isMatch(s, p.substring(2))) {
    			return true;
    		}
    		s = s.substring(1);
    	}

    	return isMatch(s, p.substring(2));
    }
}