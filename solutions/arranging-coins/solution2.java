// class Solution {
//     public int arrangeCoins(int n) {
     
//         for(int i = 1 ; i <= n ; i++){
//             int currSum = (i*(i+1))/2;
//             if (currSum > n){
//                 return i-1;
//             }else if( currSum == n ){
//                 return i;
//             }
//         }

//         return -1;
//     }
// }



class Solution {
    public int arrangeCoins(int n) {
     
       int left = 1;
       int right = (int) Math.sqrt(2.0 * n);
;
       while(left < right){
        int mid = left + (right - left + 1)/2;
        if(isValid(mid,n)){
            left = mid;
        }else{
            right = mid - 1;
        }
       }

       return left;
    }


    public boolean isValid(int x,int n){
        return n >= (  (long) x*(x+1))/2 ;
    }
}