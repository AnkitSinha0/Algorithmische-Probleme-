class Solution {
    public int splitArray(int[] nums, int k) {
        int left = Integer.MIN_VALUE;;
        int right = 0;
        for(int x : nums){
            if(x > left) left = x;
            right+=x;
        }
        while(left < right){
            int mid = left + (right - left)/2;
            if(isValid(nums,mid,k)){
                right = mid ;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean isValid(int[] nums,int check,int k){
        int currSum = 0;
        int subArr = 1;
        for(int x : nums){
            if(currSum + x <= check){
                currSum+=x;
            }else{
                subArr++;
                currSum=x;
            }
        }

        return subArr <= k;
    }
}