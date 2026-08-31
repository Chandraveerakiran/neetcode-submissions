class Solution {
    public int[] getConcatenation(int[] nums) {
        int s=nums.length*2;
        int ans[]= new int[s];
        int i;
        for( i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int j=i;
        int i1=0;
        while(j<ans.length){
            ans[j]=nums[i1];
    i1++;
    j++;
        }
        return ans;

    }
}