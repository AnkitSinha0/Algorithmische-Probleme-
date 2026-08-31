class Solution {
    public static int shipWithinDays(int[] weights, int days) {
       int right = 0;
       int left = 0 ;
       for(int weight : weights){
        left = Math.max(weight , left);
        right += weight;
       }
       while(left < right){
        int mid = left + (right - left)/2;
    

        if(isValid(weights,mid,days)){
            right = mid ;
        }else{
            left = mid + 1;
        }
        
       }
       return right;
    }
    public static boolean isValid(int[] weights , int cap, int days){
        int ind =  0;
        int daysUsed = 1;
        int sum = 0;
        while(ind < weights.length){
            if(weights[ind] + sum <= cap){
                sum+=weights[ind];
                ind++;

            }else{
                daysUsed++;
                sum = 0;
            }
        }
            return daysUsed <= days;
    }
}