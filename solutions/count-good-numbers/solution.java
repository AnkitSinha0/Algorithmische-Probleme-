class Solution {
    public int countGoodNumbers(long n) {
       
        long MOD = 1_000_000_007L;
        // long evenPos = (n%2 != 0 ) ? reCur(5 , (n+1)/2 ) : reCur(5 ,n/2) ;
        long evenPos = reCur(5 , (n+1)/2 ) ;

        long oddPos = ( n <= 1) ? 1 : reCur(4,n/2);


        return (int)(( evenPos * oddPos  ) % MOD) ;
    }

    public long reCur(int x , long n){
        long MOD = 1_000_000_007L;
        if(n == 1 ){
            return x;
        }
        if(n%2 == 0){
            long half = reCur(x,n/2);
            return (half * half) % MOD;
        }else{
            long half = reCur(x,n/2);
            return (((half * half ) % MOD )* x) %MOD;
        }

              
    }
}

// class Solution {
//     public int countGoodNumbers(long n) {
//         long res = 1 ;
//         long MOD = 1_000_000_007L;
//         for(int i = 0 ; i < n ; i++){
//             if(i%2 == 0){
//                 res = (res * 5) % MOD;
//             }else{
//                 res = (res * 4) %MOD;
//             }
//         }

//         return (int) (res % MOD);
//     }
// }