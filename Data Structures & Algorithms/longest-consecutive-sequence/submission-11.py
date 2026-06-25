class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        # mp = {}

        # for num in nums:
        #     mp[num] = mp.get(num,0) + 1

        maxCount = 0

        for i in range(len(nums)):
            pointer = nums[i]
            
            if(nums[i]-1 not in nums): 
                count = 0
                while pointer+count in nums:
                    count = count + 1
                    maxCount = max(count, maxCount)
                    
        return maxCount


            


        