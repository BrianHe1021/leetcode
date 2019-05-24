class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();

        if(numRows>len || numRows == 1){
        	return s;
        }

        char[] chars = new char[len];
        int count = 0;
        int intervial = 2*numRows -2;

        for (int i = 0; i< numRows; i++) {
        	int step = intervial - 2*i;
        	for(int j = i; j<len; j+= intervial){
        		chars[count] = s.charAt(j);
        		count ++;
        		if (step > 0 && step < intervial && j+step < len) {
        			chars[count] = s.charAt(j+step);
        			count ++;
        		}
        	}
        }
        return new String(chars);
    }
}