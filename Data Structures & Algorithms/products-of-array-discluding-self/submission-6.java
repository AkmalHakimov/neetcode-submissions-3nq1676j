class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(i, nums[i]);
        }

        int[] res = new int[nums.length];
         for(int i = 0; i < nums.length; i++){
            
            int count = 1;
            for(Integer key : map.keySet()){
                if(key != i){
                   count*=map.get(key); 
                }else{
                    
                }
            }

            res[i] = count;
        }

        return res;
    }
}  
