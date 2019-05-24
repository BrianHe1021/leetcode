/*Example input 123
123 = 100 * 1 + 10 * 2 + 3*1
321 = 100 * 3 + 10 * 2 + 1*1
#      			reminder     reversed
123       		  0            0
123/10=12		123%10 = 3     3
12/10 = 1       12%10  = 2     3*10+2
1/10  = 0       1%10   = 1     3*10*10+2*10+1
*/
class Solution {
    public int reverse(int x) {
        int reversed = 0;
        
        while(x != 0){
            int tmp = reversed*10+x%10;
            if(tmp/10 != reversed){
                return 0;
            }
            reversed = tmp;
            x = x/10;
        }
        
        return reversed;
    }
}