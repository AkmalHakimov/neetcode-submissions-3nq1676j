class Solution:
    def minWindow(self, s: str, t: str) -> str:

        if len(t) == 0:
            return ""

        mpT, window = {}, {}
        for char in t:
            mpT[char] = mpT.get(char,0)+1
        
        have, need = 0, len(mpT)
        l = 0
        res,resLen = [-1,-1], float("Infinity")
        for r in range(len(s)):
            window[s[r]] = window.get(s[r],0)+1
            if s[r] in mpT and window[s[r]] == mpT[s[r]]:
                have+=1

            while have == need:
                if (r-l+1)<resLen:
                    resLen = r-l+1
                    res = [l,r]
                
                window[s[l]] -= 1

                if s[l] in mpT and window[s[l]] < mpT[s[l]]:
                    have-=1
                l+=1
            
        l,r = res
        return s[l:r+1] if resLen != float("Infinity") else ""




        