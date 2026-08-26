class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] tail =  new int[nums.length];
        int size = -1;
        for(int x : nums){
            if(size == -1){
                tail[++size] = x;
            }else{
                int pos = bs(tail,x,size);
                if(pos ==  -1){
                    tail[++size] = x;

                }else{
                    tail[pos] = x;
                }
            }
        }
        // for(int x :tail){
        //     System.out.println(x);
        // }
        return size+1;
    }

    public int bs(int [] tails , int k ,int s){
        
        int left = 0;
        int right = s;
        int ans = -1;
        while(left <= right ){
            int mid = left + (right - left)/2;
            if(tails[mid] >= k){
                right = mid - 1;
                ans = mid;
            }
            else{
                left = mid  + 1;
            }

        }
            // System.out.println(ans);
            

        return ans;
    }
}