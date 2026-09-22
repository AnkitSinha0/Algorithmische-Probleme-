class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        boolean flag = false;
        for(int i = 0 ; i < n ; i++){
            int left = 0 ;
            int right = matrix[i].length - 1;

            while(left <= right){
                int mid = left + (right - left) / 2;
                
                if(matrix[i][mid] == target){
                    flag = true;
                    break;
                }else if(matrix[i][mid] > target ){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
                if(flag) break;
            }
        }

        return flag;
    }
}