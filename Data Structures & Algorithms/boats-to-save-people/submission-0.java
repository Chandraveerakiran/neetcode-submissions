class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int c=0;
        int i=0;
        int j=people.length-1;
        while(i<=j){
            int a =people[i]+people[j];
            if(a<=limit){
                c++;
                i++;
                j--;
            }else{
                c++;
                j--;
            }
        }
        return c;
        
    }
}