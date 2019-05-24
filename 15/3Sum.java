// brute force, important to check duplicate result
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<>();

        if (length<3) {
        	return list;
        }

        for (int Index1 = 0; Index1 <= (length-3); Index1++) {
        	for (int Index2 = Index1 + 1; Index2 <= (length-2); Index2++) {
        		for (int Index3 = Index2 + 1; Index3 <= (length-1); Index3++) {
        			if (nums[Index1]+nums[Index2]+nums[Index3] == 0) {

        				List<Integer> resultList = Arrays.asList(nums[Index1], nums[Index2], nums[Index3]);
        				Collections.sort(resultList);

        				if (list.contains(resultList)) {
        					break;
        				}else{
        					list.add(resultList);
        				}
        			}
        		}
        	}
        }
        return list;
    }
}

// consider the thrid element as the target and convert it to two sum question
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	int length = nums.length;
    	List<List<Integer>> list = new ArrayList<>();
    	Arrays.sort(nums);

    	if (nums == null || length<3) {
    		return list;
    	}

    	int max = nums[length-1];

    	if (max<0) {
    		return list;
    	}

    	for (int i=0; i< length -2; i++) {
    		if (i>0 && nums[i] == nums[i-1]) {
    			continue;
    		}
    		int target = -nums[i];
    		int left = i+1;
    		int right = length -1;

    		twoSum(nums, list, target, left, right);
    	}

    	return list;
    }

    private void twoSum(int[] nums, List<List<Integer>> result, int target, int left, int right){
    	while(left < right){
    		if (nums[left] + nums[right] == target) {
    			List<Integer> triplet = new  ArrayList();
    			triplet.add(-target);
    			triplet.add(nums[left]);
    			triplet.add(nums[right]);
    			result.add(triplet);

    			left++;
    			right--;

    			while(left < right && nums[left] == nums[left-1]){
    				left++;
    			}

    			while (left < right && nums[right] == nums[right+1]){
    				right--;
    			}

    		}else if (nums[left] + nums[right] > target) {
    			right --;
    		}else if (nums[left] + nums[right] < target) {
    			left ++;
    		}
    	}
    }
}