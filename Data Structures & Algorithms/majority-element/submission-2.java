class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer,Integer> hashMap = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
                hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0) + 1);
        }

        int maxValue = 0;
        int maxKey = 0; // or the same type as your keys

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        
        return maxKey;
    }
}