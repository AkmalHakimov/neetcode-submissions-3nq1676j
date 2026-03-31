class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int s : nums){
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        List<int[]> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }

        list.sort((a,b) -> b[1] - a[1]);

        int[] arr = new int[k];

        for(int i = 0; i<k; i++){
            arr[i] = list.get(i)[0];
        }

        return arr;
    }
}
