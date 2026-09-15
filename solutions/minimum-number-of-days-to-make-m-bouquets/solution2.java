class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for(int x : bloomDay){
            if(x > max) max = x;    
        }

        int left = 1 ;
        int right = max;
        while(left < right){
            int mid = left + (right - left) / 2;

            if(isValid(bloomDay,m,k,mid)){
                right = mid;
            }else{
                left = mid + 1;
            }


    }

    return left;
}

    public boolean isValid(int [] arr,int m , int k, int days){
        int bq = 0;
        int flw = 0;
        for(int x : arr){
            if(x<=days){
                flw++;
                if(flw == k){
                    bq++;
                    flw = 0;
                }
            }else{
                flw = 0;
            }

        }

    return bq >= m;

    }






}