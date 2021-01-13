package codingsites.leetcode

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            if(nums[0] < target){
                return 1;
            } else {
                return 0;
            }
        }
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target){
                return i;
            } else {
                int s = Math.min(nums[i],target);
                if(s == target){
                    return i;
                }
            }
        }
        return nums.length;
    }
}

/*

// 二分法 
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
*/
