class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int n = nums.length ;
         int ans = 1;
        for(int i = 0 ; i < n ; i++){
            int r = nums[i] % k;
            int sRem = 0;

            for(int j = i ; j < n ; j++){
                if(nums[j] % k != r){
                    break;
                }
                sRem = (sRem + r) % k; 

                if(sRem == r){
                    ans = Math.max(ans,j-i + 1);
                }
            }
        }

        return ans;
    }
}