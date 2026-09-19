class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        int low =0;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);

            //invalid window 
            while(map.size()>2){
                map.put(fruits[low],map.get(fruits[low])-1);
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++;
            }
            max=Math.max(max,i-low+1);



            
        }

        return max;

        
    }
}