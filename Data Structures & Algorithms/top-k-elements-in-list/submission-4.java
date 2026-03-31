class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<Integer>[] list = new List[nums.length+1];

        for(int i = 0; i<list.length; i++){
            list[i] = new ArrayList<>();
        }
        
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            list[entry.getValue()].add(entry.getKey());
        }


        int[] res = new int[k];
        int count = 0;

        for(int i = nums.length; i >0 & count<k; i--){
            for(int num : list[i]){
                res[count++] = num;
                if(count==k) return res;
            }
        }

        return res;
        
    }
}
