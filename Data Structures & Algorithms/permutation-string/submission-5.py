class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:

        mp_s1 = Counter(s1) 
        window = {}
        l = 0
        for i in range(len(s2)):
            if s2[i] not in mp_s1:
                window.clear()
                l = i + 1
                continue
            window[s2[i]] = window.get(s2[i],0)+1
            while window.get(s2[i],0) > mp_s1[s2[i]]:
                window[s2[l]] = window[s2[l]]-1
                if window[s2[l]] ==0:
                    del window[s2[l]]
                l += 1

            if window == mp_s1:
                return True

        return False 









            