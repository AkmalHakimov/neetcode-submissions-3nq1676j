class Solution {
    public int removeElement(int[] nums, int val) {

        int slow = 0;
        int fast = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
               nums[slow] = nums[fast];
               slow++;
            }
            fast++;
        }

        return slow;
    }
}