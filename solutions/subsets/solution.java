class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       List<Integer> l = new ArrayList<>();
       int ind = 0;
       backTrack(list,l,ind,nums);

       return list;

    }
    public void backTrack(List<List<Integer>> list ,List <Integer> l , int ind,int [] nums){
       if(ind >= nums.length ){
        list.add(new ArrayList<>(l));
        return;
       }

        l.add(nums[ind]);
        backTrack(list,l, ind+1 , nums);
        l.remove(l.size()-1);


        backTrack(list,l,ind+1,nums);


        
    }
}