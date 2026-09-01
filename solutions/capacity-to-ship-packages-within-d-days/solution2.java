// class Solution {
//     public static int shipWithinDays(int[] weights, int days) {
//        int right = 0;
//        int left = 0 ;
//        for(int weight : weights){
//         left = Math.max(weight , left);
//         right += weight;
//        }
//        while(left < right){
//         int mid = left + (right - left)/2;
    

//         if(isValid(weights,mid,days)){
//             right = mid ;
//         }else{
//             left = mid + 1;
//         }
        
//        }
//        return right;
//     }
//     public static boolean isValid(int[] weights , int cap, int days){
//         int ind =  0;
//         int daysUsed = 1;
//         int sum = 0;
//         while(ind < weights.length){
//             if(weights[ind] + sum <= cap){
//                 sum+=weights[ind];
//                 ind++;

//             }else{
//                 daysUsed++;
//                 sum = 0;
//             }
//         }
//             return daysUsed <= days;
//     }
// }
class Solution {
    static {
        for (int i = 0; i < 300; i++) shipWithinDays(new int[0], 1);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int total = 0, heaviest = 0;
        for (int w : weights) {
            total += w;
            heaviest = Math.max(heaviest, w);
        }
        int left = Math.max(heaviest, total / days);
        int right = heaviest * (int) Math.ceil((double) weights.length / days);
        while (left < right) {
            int mid = left + (right - left) / 2;
            int neededDays = totalDay(weights, mid);
            if (neededDays <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private static int totalDay(int[] weights, int capacity) {
        int days = 1, remaining = capacity;
        for (int weight : weights) {
            if (remaining < weight) {
                days++;
                remaining = capacity;
            }
            remaining -= weight;
        }
        return days;
    }
}