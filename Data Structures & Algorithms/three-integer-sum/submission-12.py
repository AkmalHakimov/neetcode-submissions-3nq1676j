class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        x = sorted(nums)

        mp = {}

        res = []

        for num in x:
            mp[num] = mp.get(num,0) + 1

        for i in range(0, len(x)-1, 1):
            mp[x[i]] = mp.get(x[i])-1
            
            if i and x[i-1] == x[i]:
                continue
            for j in range(i+1, len(x)-1, 1):
                mp[x[j]] = mp.get(x[j])-1

                if j-1 > i and x[j-1] == x[j]:
                    continue
                
                third = 0 - (x[j] + x[i])

                if third in mp and mp[third] > 0:
                    res.append([x[i],x[j],third])
            
            for j in range(i+1, len(x)-1, 1):
                mp[x[j]] = mp.get(x[j])+1

        return res
        

        