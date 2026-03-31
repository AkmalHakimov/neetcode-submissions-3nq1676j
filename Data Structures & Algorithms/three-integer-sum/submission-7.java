class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int i = 0; i<nums.length; i++){
            int first = nums[i];
            map.put(first, map.get(first)-1);
            if(i>0 && nums[i-1]==nums[i]) continue;
 
            for(int k = i+1; k<nums.length; k++){
            int second = nums[k];
            map.put(second, map.get(second)-1);
            if(k>i+1 && nums[k-1]==nums[k]) continue;
            int third = -(second+first);
            if(map.getOrDefault(third,0) > 0){
                res.add(Arrays.asList(first,second,third));
                }
            }

            for(int k = i+1; k<nums.length; k++){
                map.put(nums[k], map.get(nums[k]) + 1);
            }
            // map.put(first, map.get(first)+1);
        }

        return res;
    }
}
