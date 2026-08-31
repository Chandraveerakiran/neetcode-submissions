class Solution {
    public int[] getConcatenation(int[] nums) {
        int s=nums.length*2;
        int ans[]= new int[s];
        int i;
        for( i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
       
        return ans;

    }
}