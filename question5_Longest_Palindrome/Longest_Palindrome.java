/*Approach1 brute force*/
class Solution {
    int maxLeft, maxRight;
    
    public String longestPalindrome(String s) {
        int len = s.length();
        
        if(len <= 1){
            return s;
        }
        
        char[] charS = s.toCharArray();
        
        for(int i = 0; i < len; i++){
            findP (charS, i, i);
            findP (charS, i, i+1);
        }
        
        return s.substring(maxLeft, maxRight+1);
    }
    
    private void findP(char[] charArray, int left, int right){   
        while(left >= 0 && right < charArray.length && charArray[left] == charArray[right]){
            left--;
            right++;
        }
        
        if(maxRight - maxLeft < right - left-2){
            maxRight = right-1;
            maxLeft =  left+1;
        }
    }
}

/*Approach2 Dynamic programming*/
class Solution{
    public String longestPalindrome(String s){
        int len = s.length();

        if (s==null||len<2) {
            return s;
        }

        boolean[][] isPalindrome = new boolean[len][len]; 
        int maxLeft = 0;
        int maxRight = 0;

        for (int j = 1; j<len; j++) {
            for (int i = 0; i<j; i++) {
                boolean isInnerPalindrome = isPalindrome[i+1][j-1] || j-i <= 2;

                if (s.charAt(i) == s.charAt(j) && isInnerPalindrome) {
                    isPalindrome[i][j] = true;

                    if(maxRight - maxLeft < j - i){
                        maxLeft = i;
                        maxRight = j;

                    }
                }
            }
            
        }
         return s.substring(maxLeft, maxRight+1);
    }
}