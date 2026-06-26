class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if len(t) == 0:
            return ""

        mp = {}
        window = {}
        res, resLen = [-1,-1], float("Infinity")
        l = 0

        for char in t:
            mp[char] = mp.get(char,0)+1
        have,need = 0,len(mp)
        for r in range(len(s)):
            window[s[r]] = window.get(s[r],0)+1
            if  s[r] in mp and window[s[r]] == mp[s[r]]:
                have+=1
            
            while have == need:
                if (r-l+1) < resLen:
                    resLen = r-l+1
                    res = [l,r]
                window[s[l]] -= 1
                if s[l] in mp and window[s[l]] < mp[s[l]]:
                    have-=1 
                l+=1
            
        l,r = res
        return s[l:r+1] if resLen != float("Infinity") else ""