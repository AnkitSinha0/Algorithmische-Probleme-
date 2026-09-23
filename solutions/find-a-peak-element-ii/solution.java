class Solution {
    public int[] findPeakGrid(int[][] mat) {
       


       int left = 0 ;
       int right = mat[0].length  - 1;
       int [] res = new int[2];
       while(left < right){
        int mid = left + (right - left) / 2;
        int max = Integer.MIN_VALUE;
        int row = -1;
        for(int i = 0 ; i < mat.length ; i++){
            if(mat[i][mid] > max) {
                max = mat[i][mid];
                row = i;
            }
        }
        if(max > mat[row][mid+1]){
            right = mid;
        }else{
            left = mid + 1;
        }
        
       }
        
        int row = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < mat.length ; i++){
            if(mat[i][left] > max) {
                max = mat[i][left];
                row = i;
            }

        }
return new int[]{row,left};
    }
}