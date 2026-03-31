class Solution {
    public int[] twoSum(int[] nums, int target) {        
         HashMap<Integer,Integer> set = new HashMap<>();

         for(int i = 0; i < nums.length; i++){
            set.put(nums[i],i);
         }

         for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];

            if(set.containsKey(x) && set.get(x)!=i){
               if(set.get(x)>=i){
                  return new int[]{Math.min(set.get(x),i), Math.max(set.get(x),i)};
               }
            }
         }

         return new int[]{};


    }
}
