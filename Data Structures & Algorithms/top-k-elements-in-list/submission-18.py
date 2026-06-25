class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        mp = Counter(nums)
        res = []
        for i in range(k):
            max_cnt = 0
            max_num = None

            for item, cnt in mp.items():
                if cnt > max_cnt:
                    max_cnt = cnt
                    max_num = item

            res.append(max_num)
            del(mp[max_num])    
            
        return res