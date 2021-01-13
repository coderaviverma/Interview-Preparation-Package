package language.java.datastructure.arrays.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    private int[] twoSum(int[] nums, int target) {

        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                if((nums[i]+nums[j]) ==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
                
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arr={3,2,4};

        Arrays.stream(solution.twoSum2(arr, 6)).forEach(System.out::println);
    }


    private int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hash_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hash_map.containsKey(diff) && hash_map.get(diff) != i){
                return new int[] {hash_map.get(diff), i};
            }
            hash_map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Error");
    }
}