class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int j = matrix[0].length - 1;
        int i = 0; 
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target) return true;

            if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }

        return false;
    }
}



// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n = matrix.length;
//         for(int i = 0 ; i < n ; i++){
//             int left = 0 ;
//             int right = matrix[i].length - 1;

//             while(left <= right){
//                 int mid = left + (right - left) / 2;
                
//                 if(matrix[i][mid] == target){
//                     return true;
//                 }else if(matrix[i][mid] > target ){
//                     right = mid - 1;
//                 }else{
//                     left = mid + 1;
//                 }
                
//             }
           
//         }

//         return false;
//     }
// }