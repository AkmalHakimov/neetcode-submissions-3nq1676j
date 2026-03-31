class Solution {
    public int longestConsecutive(int[] nums) {
        
        int res = 0;

        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int i = 0, curr = nums[0], streak = 0;

        while(i<nums.length){
            if(curr != nums[i]){
                streak = 0;
                curr = nums[i]; 
            }

            while(i<nums.length && curr == nums[i]){
                i++;
            }

            streak++;
            curr++;
            res = Math.max(res, streak);
        }

        return res;
    }
}
