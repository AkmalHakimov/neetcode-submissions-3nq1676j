class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        mp = set(nums)

        longest = 0
        for i in nums:
            if i-1 not in mp:
                count = 0
                while i + count in mp:
                    count += 1
                    longest = max(longest, count)
                
            
        return longest