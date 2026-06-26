class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l = 0
        r = len(heights)-1
        max_l = 0
        while l<r:
            length = (r-l) * min(heights[l], heights[r])
            max_l = max(length,max_l)
            if heights[l] < heights[r]:
                l+=1
            else:
                r-=1
        
        return max_l