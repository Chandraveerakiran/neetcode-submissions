class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int i=0;
        while(i<nums.length-3){
            if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
            } int j=i+1;
            while(j<nums.length-2){
                 if(j > i + 1 && nums[j]==nums[j-1]){
                j++;
                continue;
            }
            
            int k=j+1;
            int l=nums.length-1;
            while(k<l){
                long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                List<Integer> ans= new ArrayList<>();
                if(sum==target){
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    ans.add(nums[l]);
                    result.add(ans);
                    k++;
                    l--;
                    while(k<l && nums[k]==nums[k-1])k++;
                    while(k<l && nums[l]==nums[l+1])l--;

                }else if(sum<target){
                    k++;
                }else if(sum>target){
                    l--;
                }
            }
            j++;
            }
            i++;
        }
        return result;
        
    }
}