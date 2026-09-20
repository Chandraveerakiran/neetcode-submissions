class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int arr1[]= new int[26];
        int arr2[]= new int[26];
        for(int i=0;i<s1.length();i++){
           int val= s1.charAt(i)-'a';
           arr1[val]++;
        }
        int low=0;
        for(int i=0;i<s2.length();i++){
            int val=s2.charAt(i)-'a';
            arr2[val]++;
            if(s1.length()==i-low+1){
                if(Arrays.equals(arr1,arr2)){
                    return true;
                }
                arr2[s2.charAt(low)-'a']--;
                low++;

            }
        }
        return false;
        
    }
}
