class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        mp = set()

        l = 0
        r = 0
        max_l = 0
        while r<len(s):
            while s[r] in mp:
                mp.remove(s[l])
                l+=1
            mp.add(s[r])
            max_l = max(max_l, r-l+1)
            r+=1
        return max_l