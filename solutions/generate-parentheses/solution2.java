// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> list = new ArrayList<>();
//         int open = n;
//         int close = n;
//         String s = "(";
//         return genRecur(list,open-1,close,s);

//     }
//     public List<String> genRecur(List<String> list ,int open , int close,String s){
        
//         if(open == 0 && close == 0){
//         list.add(s);
//             return list;
//         }
//         if(open > 0){
//            genRecur(list,open-1,close,s + "(")  ;
//         }
//         if(close > open){

//            genRecur(list,open,close-1,s + ")");
//         }  

//         return list;

//     }
// }

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int open = n;
        int close = n;
        String s = "(";
         genRecur(list,open-1,close,s);
         return list;

    }
    public void genRecur(List<String> list ,int open , int close,String s){
        
        if(open == 0 && close == 0){
        list.add(s);
            return ;
        }
        if(open > 0){
           genRecur(list,open-1,close,s + "(")  ;
        }
        if(close > open){

           genRecur(list,open,close-1,s + ")");
        }  

        return ;

    }
}