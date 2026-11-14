class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum = Integer.MAX_VALUE ;
        int n = nums.size();

        for(int k = l ; k <= r ; k++){
            
            for(int i = 0 ; i <= n - k ; i++ ){
                int currSum = 0;
                for(int j = 0 ; j < k ; j++){
                    currSum += nums.get(i+j);
                   
                }
                if(currSum > 0){
                 sum = Math.min(currSum , sum);
                }
            }
          
        }
        return sum != Integer.MAX_VALUE ? sum : -1;
    }
}