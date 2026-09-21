class Solution {
    public String minWindow(String s, String t) {
        int sarr[]= new int [128];
        int tarr[]= new int [128];
        int low=0;
        int min=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<t.length();i++){
            tarr[t.charAt(i)]++;
        }
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            sarr[ch]++;
            //valid window 
            while(helper(sarr,tarr)){
                int len=high- low+1;
                if(len<min){
                    min=len;
                    ans=s.substring(low,high+1);
                }
                sarr[s.charAt(low)]--;
                low++;
            }



        }
        return ans;
    }

        
    
    
    static boolean helper(int sarr[], int tarr[]){

    for(int i=0;i<128;i++){
   
    if(sarr[i]<tarr[i]){
        return false;
    }
    }
   return  true;
    

}
    
}
