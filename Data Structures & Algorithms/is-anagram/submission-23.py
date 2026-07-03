class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mp = Counter(s)
        
        for i in range(len(t)):
            mp[t[i]]-=1
        
        for val in mp.values():
            if val!=0:
                return False
        return True