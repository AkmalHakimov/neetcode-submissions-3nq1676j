class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        if s == "":
            return 0

        mp = {}

        left = 0
        mp[s[0]] = 0
        right = 0
        maxLen = 0
        while right<len(s):
            if right != 0 and s[right] in mp:
                left = max(left, mp[s[right]]+1)
            maxLen = max(maxLen, right - left+1)
            mp[s[right]] = right
            right+=1

        return maxLen