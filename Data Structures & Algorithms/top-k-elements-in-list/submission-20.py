class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        mp = Counter(nums)

        # bucked = [0] * (len(nums)+1)
        bucked = [[] for i in range(len(nums)+1)]
        for key, value in mp.items():
            bucked[value].append(key)

        res = []
        for i in range(len(bucked)-1, 0, -1):
            for i in bucked[i]:
                res.append(i)
                k-=1
                if k == 0:
                    return res
            