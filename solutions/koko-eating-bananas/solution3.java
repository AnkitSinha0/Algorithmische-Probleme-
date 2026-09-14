class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int mapile = Integer.MIN_VALUE;

        for(int pile : piles){
            if(mapile < pile){
                mapile = pile;
            }
        }
      int left = 1;
      int right = mapile;
      while(left < right){
        int mid = left + (right - left) /2;
        if(isValid(piles,mid,h))  right = mid;      
        else left = mid + 1;
    }
    return right;  
}
      
   

    public boolean isValid(int [] piles , int k ,int h){
        int time = 0;
        for(int pile : piles){
          
        //     int div = pile / k;
        //     time += div;
        //     if(pile%k!=0) time++;
        // }
        time+=(pile + k - 1) / k ;

       
    }
return h >= time;
}
}

// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {

//         int mapilePiles = 0;
//         int hours = 0;
//         for (int pile : piles) {
//             mapilePiles = Math.mapile(pile, mapilePiles);
//         }

//         int low  =  1;
//         int high =   mapilePiles;
//         while(low<=high){
//            int  mid = low +high /2;
//             int hrs = 0;
//             for (int pile : piles) {
//                 hrs += (pile + mid - 1) / mid;
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

//         int mapilePiles = 0;

//         for (int pile : piles) {
//             mapilePiles = Math.mapile(pile, mapilePiles);
//         }

//         for (int mid = 1; mid <= mapilePiles; mid++) {
//             long hrs = 0;
//             for (int pile : piles) {
//                 hrs += (pile + mid - 1) / mid;
//             }
//             if (hrs <= h) {
//                 return mid;
//             }
//         }

//         return -1;
//     }
// }