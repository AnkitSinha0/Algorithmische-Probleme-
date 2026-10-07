class Solution {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1) return 1;
        long cnt = Math.abs( (long) n);
        double res = recur(x ,  cnt);
        if(n < 0 ){
            return 1 / res;
        }
        return res;
    }

    public double recur(double x, long cnt){
        if(cnt == 1) return x;

        if(cnt % 2!=0){
            double half = recur(x , (cnt-1)/2);
            return half * half * x;

        }else{
            double half = recur(x,cnt/2);
            return half * half;
        }
    }
}