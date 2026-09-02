class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0 ;
        int right = arr.length - 1;
       

     
        while(left < right){
            int mid = left + (right - left)/2;
            int mis = arr[mid] - ( mid + 1);
        // System.out.println(mis);
            
            if(mis >= k ){
                right = mid;
            }else{
                left = mid  + 1;
            }
        }

        int mis =  arr[right] -  (right + 1);
        // System.out.println(mis);
        if(mis >= k){
            return arr[right] - ( mis - k + 1);
        }else{
            return arr[right] + (k- mis);
        }

    }
}
// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int cnt = 1 ;
//         int ind = 0 ;
        
//         while(ind  < arr.length && k != 0){
//             if(arr[ind] == cnt){
//                 ind++;
//             }else{
//                 k--;
//             }
//             cnt++;
//         }

//          if( k > 0){
//             return cnt - 1 + k;
//          } return cnt - 1;
//     }
// }