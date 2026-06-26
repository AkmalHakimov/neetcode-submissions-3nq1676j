class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        nums.sort()
        mp = Counter(nums)
        res = []

        for i in range(len(nums)-1):
            mp[nums[i]] -= 1
            if i and nums[i-1] == nums[i]:
                continue
            for j in range(i+1, len(nums)-1, 1):
                mp[nums[j]] -= 1
                if j-1 > i and nums[j-1] == nums[j]:
                    continue    
                third = 0 - (nums[i] + nums[j])
                if third in mp and mp[third] > 0:
                    res.append([nums[i], nums[j], third])     
            for j in range(i+1, len(nums)-1, 1):
                mp[nums[j]] += 1

        return res





                    