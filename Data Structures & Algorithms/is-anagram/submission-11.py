class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if(len(s) != len(t)):
            return False
        mp = {}

        for ch in s:
            mp[ch] = mp.get(ch,0) +1

        for ch in t:

            if(ch in mp):
                if(mp.get(ch) == 1):
                    del mp[ch]
                else:
                    mp[ch] = mp.get(ch)-1

        return not mp
        