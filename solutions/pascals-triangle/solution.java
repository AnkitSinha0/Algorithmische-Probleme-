class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numRows ; i++){
           if(i == 0 ){
            List<Integer> n = new ArrayList<>();
            n.add(1);
            list.add(n);
            continue;
           }
           List <Integer> n = new ArrayList<>();
                List<Integer> temp = list.get(i-1);

           for(int j = 0 ; j <= i ; j++){
            
            if(j == 0 || j == i){
                n.add(1);
            }else{
                int a = temp.get(j);
                int b = temp.get(j-1);           
                n.add(a+b);     
            }
           }
           list.add(n);
            }

            return list;
        }
    
}