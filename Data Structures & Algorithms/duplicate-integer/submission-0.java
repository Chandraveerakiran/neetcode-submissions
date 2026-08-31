class Solution {
    public boolean hasDuplicate(int[] nums) {
         HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       }
       boolean df=false;
       for(int s:hm.keySet()){
        if(hm.get(s)>=2){
            df=true;
            break;
    }
}
return df;
    }
}