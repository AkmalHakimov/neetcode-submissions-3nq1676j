class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        mp = defaultdict(list)

        for word in strs:
            res = "".join(sorted(word))
            mp[res].append(word)

        return list(mp.values())
                
            
        