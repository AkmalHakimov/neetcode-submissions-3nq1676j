class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        mp = {}



        for word in strs:
            res = "".join(sorted(word))

            if(res in mp):
                mp.get(res).append(word)
            else:
                arr = []
                arr.append(word)
                mp[res] = arr

            
        return list(mp.values())
                
            
        