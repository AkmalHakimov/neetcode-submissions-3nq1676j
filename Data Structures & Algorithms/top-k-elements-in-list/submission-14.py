class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        """ [4,4,5,5,5,5,2]
        4 - 2 
        5 - 4
        2 - 1

        [0,2,4,0,5]
        """

        mp = {}

        freq = [[] for i in range(len(nums) + 1)]

        for i in nums:
            mp[i] = mp.get(i,0) + 1
        for item, cnt in mp.items():
            freq[cnt].append(item)

        arr = []
        for item in range(len(freq) - 1, 0, -1):
            for i in freq[item]:
                arr.append(i)
            
            if len(arr) == k:
                return arr

        
        

        
        