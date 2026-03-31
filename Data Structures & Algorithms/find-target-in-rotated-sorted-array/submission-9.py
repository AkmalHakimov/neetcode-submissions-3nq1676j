class Solution:
    def search(self, nums: List[int], target: int) -> int:
        pivot = self.find_pivot(nums)

        if nums[pivot] <= target <= nums[-1]:
            return self.bin_search(nums, target, pivot, len(nums) - 1)
        else:
            return self.bin_search(nums, target, 0, pivot - 1)

    def find_pivot(self, nums: List[int]) -> int:
        l, r = 0, len(nums) - 1

        while l < r:
            mid = (l + r) // 2

            if nums[mid] > nums[r]:
                l = mid + 1
            else:
                r = mid

        return l

    def bin_search(self, nums: List[int], target: int, l: int, r: int) -> int:
        while l <= r:
            mid = (l + r) // 2

            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                l = mid + 1
            else:
                r = mid - 1

        return -1

