class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        mp = set(nums)

        res = 0
        for i in nums:
            if i-1 not in mp:
                count = 0
                while count+i in mp:
                    count+=1
                res = max(count,res)

        return res