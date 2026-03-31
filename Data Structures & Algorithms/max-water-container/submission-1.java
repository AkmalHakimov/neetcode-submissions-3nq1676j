class Solution {
    public int maxArea(int[] heights) {


        int res = 0, i = 0, j = heights.length-1;
        
                
        while(i<j){
           int x = Math.min(heights[i], heights[j]) * (j-i);
           res = Math.max(res,x);
           if(heights[i] > heights[j]){
             j--;
           }else{
            i++;
           }
        }

        return res;
    }
}
