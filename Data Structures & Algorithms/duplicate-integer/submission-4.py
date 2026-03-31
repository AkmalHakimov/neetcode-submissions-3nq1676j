class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        
        sorted_nums = sorted(nums)
    
        for i in range(1,len(sorted_nums)):
           x = sorted_nums[i]
           if(sorted_nums[i-1] == x):
             return True
        return False