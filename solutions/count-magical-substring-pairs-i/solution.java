class Solution {
    public int countMagicalPairs(String s) {
        char [] c = s.toCharArray();
        int n = c.length;
        long ans = 0;

        for(int i = 0 ; i < n - 1 ; i++){
            int [] L = new int[27];
            int[] R = new int[27];

            boolean [] seen = new boolean[26];
            int d = 0 ;
             for(int j = i ; j >= 0 ; j--){
                 int ch = c[j] - 'a';
                 if(!seen[ch]){
                     seen[ch] = true;
                     d++;
                 }
                 L[d]++;
             }

            seen = new boolean[26];
            d=0;
            for(int k = i + 1 ; k < n ; k++){
                int ch = c[k] - 'a';
                if(!seen[ch]){
                    seen[ch] = true;
                    d++;
                }
                R[d]++;
            }
            for(int x = 1 ; x <= 26 ; x++) ans += (long) L[x] * R[x];
        }
        return (int) ans;
    }
}