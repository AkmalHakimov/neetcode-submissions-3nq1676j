class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        while(l<r){
            int m = l+(r-l)/2;

            if(nums[m] < nums[r]){
                r = m;
            }else{
                l = m+1;
            }
        }

        int pivot = l;

        int result = binSearch(nums, 0, pivot-1, target);

        if(result != -1){
            return result;
        }

        return  binSearch(nums, l, nums.length-1, target);


    }

    public int binSearch(int[] nums, int l, int r, int target){
        while(l<=r){
            int m = l+(r-l)/2;

            if(nums[m] == target){
                return m;
            }else if(nums[m] < target){
                l = m+1;
            }else{
                r = m-1;
            }
        }
            return -1;
    }
}
