class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        int [] starts = new int[n];
        int [] ends = new int[n];

        for(int i = 0 ; i < n ; i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        } 

        Arrays.sort(starts);
        Arrays.sort(ends);

        long ans = 0 ;
        int end = 0 ;

        for(int start = 0 ; start < n ; start++){
            while(end < n && ends[end] < starts[start]){
                end++;
            }
            ans+=start - end;
        }

        return ans;
    }
}