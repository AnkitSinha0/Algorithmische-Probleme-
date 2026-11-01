class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        int prev = nums[0];
        for(int  i = 1 ; i < nums.length ;i++){
            if(i % 2 != 0 ){
                int result = prev * (int) Math.pow(10, String.valueOf(nums[i]).length()) + nums[i];
                min = Math.min(result , min);
            }else{
                prev = nums[i];
            }
        }

        return min;
    }
}