class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        long ans = 0;
        int left = 0;
        int right = x/2;
        while(left<=right){
            int mid = left + (right - left)/2;
            if((long) mid*mid <= x){
                ans = mid;
                left = mid + 1;
            }else{
            right = mid - 1;
        }
    }
    return (int) ans;
}}