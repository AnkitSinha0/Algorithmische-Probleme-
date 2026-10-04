class Solution {
    public boolean canTransform(int[] source, int[] target) {
       long sumS = 0 ;
        long sumT = 0;
        for(int x : source){
            sumS += x;
        }
        for(int x : target){
            sumT +=x;
        }

        if(sumS != sumT){
            return false;
        }

        return true;
    }
}