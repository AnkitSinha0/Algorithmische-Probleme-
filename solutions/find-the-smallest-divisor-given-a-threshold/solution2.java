class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int x : nums){
            if(x > max) max = x;
        }

        int left = 1;
        int right = max;

        while(left < right){
            int mid = left + (right - left ) /2;
            if(isValid(nums,threshold,mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public boolean isValid(int [] nums , int k, int div){
        long sum = 0; 
        for(int x : nums){
            sum+=(x + div - 1 ) / div;
        }
     
        
        return k >= sum;
    }
}