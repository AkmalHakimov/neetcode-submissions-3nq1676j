class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] newArr = new int[2];
        int k = 0;

        for(int i = 0; i<nums.length; i++){
            k = Math.abs(target - nums[i]);

            for(int j = i+1; j < nums.length; j++){
                if(Math.abs(nums[j]) == k){
                    newArr[0] = i;
                    newArr[1] = j;
                    break;
                }
            } 

             if(newArr[1]!=0){
                break;
            }
        }

        return newArr; 
    }
}
