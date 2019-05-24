package question1_Two_Sum.java;

import java.util.Arrays;

/**
Solution1 check every number in the list
Time : O(N^2) ; Space: O(1)
**/
class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] input={2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }
}

/**
Solution2 build a hashmap to store
Time : O(N) ; Space: O(N)
**/
/**
public class Solution2 {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
 **/