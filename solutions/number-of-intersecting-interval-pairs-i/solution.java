class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int res =  0;
        for(int  i = 0 ; i < intervals.length ; i++){
            for(int j = i + 1 ;  j < intervals.length ; j++){
                if(intervals[j][0] <= intervals[i][1] && intervals[j][1] >= intervals[i][0]){
                    res++;
                }
            }
        }

        return res;
    }
}