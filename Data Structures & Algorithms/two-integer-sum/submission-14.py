class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        mp = {}
        for i in range(len(nums)):
            third = target - nums[i]
            if third in mp:
                return [mp[third], i]
            mp[nums[i]] = i
        return []