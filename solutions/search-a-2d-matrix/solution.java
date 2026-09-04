class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int [] nums : matrix){
            for(int x : nums){
                if(x == target){
                    return true;
                }
            }
        }

        return false;
    }
}