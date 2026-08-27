class Solution {
    public int findPeakElement(int[] nums) {
        int res = 0;
        int n = nums.length;
      
        for(int i  = 0 ; i < n ; i++){
            if(i == 0 && n!=1){
                if(nums[i] > nums[i+1] ){
                    return i;
                }
            }
            else if(i == n-1 && n!=1){
                if(nums[i]>nums[i-1]){
                    return i;
                }
            }
            else{
                if(n!=1 && nums[i]>nums[i-1] && nums[i] > nums[i+1] ){
                    return i;
                }
            }
        }
        return res;
    }
}