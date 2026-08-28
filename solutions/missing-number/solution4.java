// class Solution {
//     public int missingNumber(int[] nums) {
//         int[]  arr =  new int[nums.length+1];
// // mistake i was doign was that i tried to make length of arr as n which is 0 to n-1 so when
// // accessing that index via nums[i] arr gave out of bound
//         for(int i = 0 ; i < nums.length ; i++){
//             arr[nums[i]]++; 
//         }
//         for(int i = 0 ; i < arr.length ; i++){
//             if(arr[i] != 1){
//                 return i;
//             }
//         }
//         return 0;
//     }
// }

// O(1) space sol

// class Solution {
//     public int missingNumber(int[] nums) {
// int n = nums.length;    
// int actualSum = n(n+1)/2;
//     
//     int givenSum = 0;
//     for(int x : nums ){
//         givenSum+=x;
//     }

//     return actualSum - givenSum;
//     }
// }

// BinarySsearch

// class Solution {
//     public int missingNumber(int[] nums) {
//     Arrays.sort(nums);
//     int left = 0 ;
//      int right = nums.length;

//      while(left < right ){
//         int mid = left + (right - left)/2;
//         if(mid == nums[mid]){
//             left  = mid + 1;
//             }else{
//                 right = mid;
//             }
        
//      }

//      return left;

//     }
// }

class Solution {
    public int missingNumber(int[] nums) {
    int ans = 0;
    for(int x : nums ){
        ans^=x;
    }
    for(int i = 1 ; i <= nums.length ; i++){
        ans^=i;
    }

    return ans;

    }
}