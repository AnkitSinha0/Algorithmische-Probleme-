class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int x : nums){
            set.add(x);
            if(x > max) max = x;
        }
        if(max < 0) return 1;
        for(int i = 1 ; i <= max ; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}