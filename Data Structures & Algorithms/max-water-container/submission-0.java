class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max=-1;
        while(i<j){
            int min=Math.min(heights[i],heights[j]);
            int area= min*(j-i);
             max=Math.max(max,area);
            if(heights[i]<heights[j]){
                i++;

            }else if(heights[i]>heights[j]){
                j--;
            }else if(heights[i]==heights[j]){
                i++;
                j--;
            }
        }
        return max;
        
    }
}
