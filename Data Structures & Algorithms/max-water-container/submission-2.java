class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;

        int res = 0;
        while(i<j){
            
            int min = Math.min(heights[i],heights[j]);
            int upt = min * (j-i);
            res = Math.max(res,upt);

            if(heights[i]<heights[j]){
              i++;
            } else {
              j--;
            }
        }

        return res;
    }
}
