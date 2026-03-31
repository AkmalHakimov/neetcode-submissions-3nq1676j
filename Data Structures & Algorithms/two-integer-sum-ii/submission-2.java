class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int[] arr = new int[1];

        // if(numbers.length == 0){
        //     return numbers;    
        // }

        int i =0, j = numbers.length-1;
        while(i<j){
            // if(numbers[i]+numbers[j]>target){
            //     return new int[0];
            // }

            if(numbers[i]+numbers[j] > target){
                j--;
            }

             if(numbers[i]+numbers[j] < target){
                i++;
            }

            if(numbers[i]+numbers[j] == target){
                return new int[]{i+1,j+1};
            }
        }
        return new int[0];
    }
}
