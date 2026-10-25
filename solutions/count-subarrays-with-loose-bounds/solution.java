class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long cnt = 0 ;
         int lastIn = -1;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] < minK || nums[i] > maxK){
                lastIn = i;
            }else{
                cnt += i - lastIn;
            }
        }

        return cnt;

        // long cnt = 0 ;
        // for(int len = 1 ; len <= nums.length ; len++){
        //     for(int start  = 0 ; start <= nums.length- len ; start++){
        //         boolean valid = true;
        //     for(int i = start ; i < start + len ; i++){
        //         if(nums[i] < minK || nums[i] > maxK){
        //             valid = false;
        //             break;
        //         }
  
        //     }

        //     if(valid){
        //         cnt++;
        //     }
        //     }
        // }

        // return cnt;
    }
}