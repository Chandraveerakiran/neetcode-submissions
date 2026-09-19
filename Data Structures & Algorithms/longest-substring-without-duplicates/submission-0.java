class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int low=0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int high=0;high<s.length();high++){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            //invalid window 
            int k=high-low+1;
            while(map.size()<k){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low))==0){
                    map.remove(s.charAt(low));
                }
                low++;
                k=high-low+1;

            }
            max=Math.max(max,high-low+1);
        }
        return max;
        
    }
}
