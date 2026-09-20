class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int low=0;
          int sum=0;
        for(int high=0;high<nums.length;high++){
          
             sum=sum+nums[high];
             //valid
             while(sum>=target){
                 min=Math.min(min,high-low+1);
            //shrink it
                sum=sum-nums[low];
                low++;
             }
             
        }
        return min==Integer.MAX_VALUE? 0 : min;

        
    }
}