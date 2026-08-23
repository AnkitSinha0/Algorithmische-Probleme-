class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        boolean[] arr = new boolean[upper+1];
        for(int num : nums){
            if(num >= lower && num <= upper){
                arr[num] = true;
            }
        }
        List<List<Integer>> list  = new ArrayList<>();
        int i  = lower;
        while(i <= upper){
            if(arr[i]){
                i++;
                continue;
            }
            int start = i ;
            while(i <= upper && !arr[i]){
                i++;
            }
            int end = i - 1;
            list.add(Arrays.asList(start,end));
        }

        return list;
        
    }
}