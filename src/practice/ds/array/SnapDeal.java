package practice.ds.array;

import java.util.HashMap;
import java.util.Map;

public class SnapDeal {

    public int maxSubarraySumCircular(int[] nums) {

        // (2+1)%5=3
        // (2-1+5)%5=1

        Map<Integer, Integer > hm=new HashMap<>();
        int n=nums.length;
        int maxVal = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            if(nums[i]>maxVal){
                maxVal=nums[i];
            }

            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }

        }

        return maxVal*hm.get(maxVal);
    }
}
