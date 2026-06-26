class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        mp = {}

        maxL = 0
        maxF = 0
        l = 0

        for r in range(len(s)):
            mp[s[r]] = mp.get(s[r],0)+1
            maxF = max(maxF, mp[s[r]])
            while (r-l+1) - maxF > k:
                mp[s[l]] = mp.get(s[l],0)-1
                l+=1
            maxL =max(maxL, r-l+1)
        
        return maxL