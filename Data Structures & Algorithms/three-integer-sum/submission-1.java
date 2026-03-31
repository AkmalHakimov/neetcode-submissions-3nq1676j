class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> list = new HashSet<>();

        Arrays.sort(nums);
       for(int i = 0; i<nums.length; i++){
          for(int j = i+1; j<nums.length; j++){
            int tmp = 0 - (nums[i] + nums[j]);
            for(int k = j+1; k<nums.length; k++){
                if(tmp == nums[k]){
                    List<Integer> arr = Arrays.asList(nums[i], nums[j], nums[k]);
                    list.add(arr);
                }
            }
          }
       } 

       return new ArrayList<>(list); 
    }
}
