class Solution {
    public int countGoodNumbers(long n) {
       
        long MOD = 1_000_000_007L;
        // long evenPos = (n%2 != 0 ) ? reCur(5 , (n+1)/2 ) : reCur(5 ,n/2) ;
        long evenPos = reCur(5 , (n+1)/2 ) ;

        long oddPos = reCur(4,n/2);


        return (int)(( evenPos * oddPos  ) % MOD) ;
    }

    public long reCur(int x , long n){
        long MOD = 1_000_000_007L;
        if(n == 0 ){
            return 1;
        }
        
            long half = reCur(x,n/2);
            long res = (half * half ) % MOD;
        if(n%2 == 1){
            res =  (res * x ) %MOD;
        }

        return res;
            
              
    }
}

// class Solution {
//     public int countGoodNumbers(long n) {
//         long res = 1 ;
//         long MOD = 1_000_000_007L;
//         for(long i = 0 ; i < n ; i++){
//             if(i%2 == 0){
//                 res = (res * 5) % MOD;
//             }else{
//                 res = (res * 4) %MOD;
//             }
//         }

//         return (int) (res % MOD);
//     }
// }