package practice.ds.array;

class Solution {

    public static void main(String[] args) {

        int[] a={2,3,5,1,1,1,4};

        Solution s=new Solution();
        System.out.println("Minimum jumps required - "+s.jump(a));
        System.out.println("Minimum jumps2 required - "+s.jump2(a));

    }
    public int jump(int[] nums) {
        
        return jump(nums,nums.length,0);
    }
    
    
    int jump(int[] nums,int n,int currpos){
        
        if(currpos>=n-1){
            return 0;
        }
        
        int minJump=Integer.MAX_VALUE;
        
        int maxSteps=nums[currpos];
        
        while(maxSteps>0){
            minJump=Math.min(minJump,1+jump(nums,n,currpos+maxSteps));
            maxSteps=maxSteps-1;
        }
        
        return minJump;
    }

    public int jump2(int[] nums) {

        int jump=0,currentJumpEnd=0,fartest=0;

        for (int i = 0; i < nums.length-1; i++) {
            fartest= Math.max(fartest,i+nums[i]);

            if (i==currentJumpEnd){
                jump++;
                currentJumpEnd=fartest;
            }

        }

        return jump;

    }

}