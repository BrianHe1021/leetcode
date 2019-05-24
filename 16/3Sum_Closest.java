class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int diff = 0x7fffffff;
        int currentBest = 0;

        for (int i=0; i< len-2; i++) {
        	int left = i + 1;
        	int right = len - 1;
        	while(left < right){
        		int sum = nums[i] + nums[left] + nums[right];
        		int currentDiff = Math.abs(sum - target);
        		if (currentDiff == 0) {
        			return sum;
        		}
        		if (currentDiff < diff) {
        			diff = currentDiff;
        			currentBest = sum;
        		}
        		if (sum > target) {
        			right --;
        		}else{
        			left ++;
        		}
        	}
        }
        return currentBest;
    }
}