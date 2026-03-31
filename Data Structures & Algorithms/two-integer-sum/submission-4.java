class Solution {
    public int[] twoSum(int[] nums, int target) {        
         HashMap<Integer,Integer> set = new HashMap<>();

         int[] arr = new int[2];

         for(int i = 0; i < nums.length; i++){
            set.put(nums[i],i);
         }

         for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];

            if(set.containsKey(x) && set.get(x)!=i){
               if(set.get(x)>=i){
                arr[1] = set.get(x);
                arr[0] = i; 
               }else{
                 arr[1] = i;
                 arr[0] = set.get(x);
               }
            }
         }

         return arr;


    }
}
