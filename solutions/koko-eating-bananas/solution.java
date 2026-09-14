class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;

        for(int x : piles){
            if(max < x){
                max = x;
            }
        }
      int left = 1;
      int right = max;
      while(left < right){
        int mid = left + (right - left) /2;
        if(isValid(piles,mid,h)){
            right = mid;
        }else{
            left = mid + 1;
        }

        
      }
      return right;
    }

    public boolean isValid(int [] piles , int k ,int h){
        int time = 0;
        for(int x : piles){
            if(x <= k ){
                time++;
            }else{
                time+=x/k;
                if(x%k!=0){
                    time++;
                }
                
            }
        }

        if(time <= h){
            return true;
        }
        return false;
    }
}


// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {

//         int maxPiles = 0;
//         int hours = 0;
//         for (int x : piles) {
//             maxPiles = Math.max(x, maxPiles);
//         }

//         int low  =  1;
//         int high =   maxPiles;
//         while(low<=high){
//            int  mid = low +high /2;
//             int hrs = 0;
//             for (int x : piles) {
//                 hrs += (x + mid - 1) / mid;
//             }
//             if(hrs <= h){
//             hours = hrs;
//             high =  mid - 1;
//             }else{
//                 low =  mid  + 1;
//             }

//         }
       

//         return hours;
//     }
// }
// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {

//         int maxPiles = 0;

//         for (int x : piles) {
//             maxPiles = Math.max(x, maxPiles);
//         }

//         for (int mid = 1; mid <= maxPiles; mid++) {
//             long hrs = 0;
//             for (int x : piles) {
//                 hrs += (x + mid - 1) / mid;
//             }
//             if (hrs <= h) {
//                 return mid;
//             }
//         }

//         return -1;
//     }
// }