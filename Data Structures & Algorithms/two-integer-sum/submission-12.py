class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        mp = {}
        arr = 2 * [0]
        for i in range(len(nums)):
            third = target - nums[i];
            if(third in mp and mp.get(third) is not i):
                arr[0] = mp.get(third)
                arr[1] = i 
            
            mp[nums[i]] = i
        
        return arr
        