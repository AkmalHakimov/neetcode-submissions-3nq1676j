class Solution {
    public int[] productExceptSelf(int[] nums) {


        int[] arr = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            int s = 1;
            for(int k = 0; k<nums.length; k++){
                if(i != k){
                    s *= nums[k];
                }
            }
           
           arr[i] = s;
        }  

        return arr;
    }
}  
