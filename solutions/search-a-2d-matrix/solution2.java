class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix[0].length;
        int col = matrix.length;

        int left = 0 ;
        int right = row*col - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            
            int r = mid / row;
            int c = mid % row;
            
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }


        return false;

    } 
}