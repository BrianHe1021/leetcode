class Solution {
    public int myAtoi(String str) {

        int head = 0;
        int sign = 1;
        double result = 0;

        // clean all beginning whitespace
        str = str.trim();

        if(str == null || str.length() == 0){
        	return 0;
        }

        // cheack negative number
        if (str.charAt(0) == '-') {
        	sign = -1;
        	head++;
        }

        // check positive number
        if (str.charAt(0) == '+') {
        	head++;
        }

        //check the main string body
        for (; head<str.length(); head++) {

        	// if it is nonnumber char, then break
        	if (str.charAt(head)<'0'||str.charAt(head)>'9') {
        		break;
        	}

        	result = result*10+(int)(str.charAt(head)-'0');
        }

        result = result * sign;
        //check range
        if (result>Integer.MAX_VALUE) {
        	return Integer.MAX_VALUE;
        }

        if (result<Integer.MIN_VALUE) {
        	return Integer.MIN_VALUE;
        }

        return (int)result;
    }
}