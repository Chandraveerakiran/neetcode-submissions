class Solution {
    public int characterReplacement(String s, int k) {
        int fre[]= new int[26];
        int low=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'A';
            fre[val]++;
            int len = i-low+1;
            int max=helper(fre);
            int diff=len-max;
            while(diff>k){
                fre[s.charAt(low)-'A']--;
                low++;
                len = i-low+1;
                max=helper(fre);
                diff=len-max;

            }
            res=Math.max(res,len);


        }
        return res;
        
    }
     static int helper(int fre[]){
        int max=0;
        for(int x:fre){
        max=Math.max(max,x);
        }
        return max;
    
   
    }
}

