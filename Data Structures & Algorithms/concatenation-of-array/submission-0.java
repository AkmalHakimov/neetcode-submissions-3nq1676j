class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[2*nums.length];

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            newArr[i] = nums[i];
        }

        for(int i = nums.length; i < 2*nums.length; i++){
            newArr[i] = nums[count++];
        }

        return newArr;
    }
}