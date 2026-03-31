class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        mp = {}

        for num in nums:
            mp[num] = mp.get(num,0) + 1

        maxCount = 0

        for i in range(len(nums)):
            pointer = nums[i]
            
            if(nums[i]-1 not in mp): 
                count = 0
                while pointer in mp:
                    count = count + 1
                    maxCount = max(count, maxCount)
                    pointer = pointer + 1
            
        
        return maxCount


            


        