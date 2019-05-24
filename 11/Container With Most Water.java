// brute force
class Solution {
    public int maxArea(int[] height) {
        //check edge case
        if (height.length == 2) {
        	return Math.min(height[0], height[1]);
        }

        int maxArea = 0;

        for (int i = 0; i<height.length; i++) {
        	for (int j=i+1; j<height.length; j++) {
        		maxArea = Math.max(maxArea, Math.min(height[i], height[j])*(j-i));
        	}
        }

        return maxArea;
    }
}
//Two way search, from both side to left, move the shorter pointer
class Solution {
    public int maxArea(int[] height) {
    	int maxArea = 0;
    	int leftIndex = 0;
    	int rightIndex = height.length-1;

    	while(rightIndex>leftIndex){
    		int h = Math.min(height[rightIndex], height[leftIndex]);
    		maxArea = Math.max(maxArea, h*(rightIndex-leftIndex));
    		while(height[leftIndex]<=h && rightIndex>leftIndex){
    			leftIndex++;
    		}
    		while(height[rightIndex]<=h && rightIndex>leftIndex){
    			rightIndex--;
    		}
    	}
    	return maxArea;
    }
}