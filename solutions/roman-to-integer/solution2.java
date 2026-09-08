// class Solution {
//     public int romanToInt(String s) {
//         HashMap <Character ,Integer > map =  new HashMap <>(
//             Map.of(
//                 'I' ,  1 ,
//                 'V' , 5 , 
//                 'X' , 10 , 
//                 'L' , 50 ,
//                 'C' , 100 ,
//                 'D' , 500 ,
//                 'M' , 1000 
//             )
//         );
//         int res = 0 ;
//         for(int i = 0 ; i < s.length() - 1 ; i++ ){
//             int currVal = map.get(s.charAt(i));
//             int nextVal = map.get(s.charAt(i+1));
//             // System.out.println(currVal+" "+i);
//             if(currVal < nextVal){
//                 res += nextVal - currVal;
//                 i++;
//             }else{
//                 res+=currVal;
                
//             }
//         }
        
//         return res ;
       
//     }
// }
class Solution {
    public int romanToInt(String s) {
        HashMap <Character ,Integer > map =  new HashMap <>(
            Map.of(
                'I' ,  1 ,
                'V' , 5 , 
                'X' , 10 , 
                'L' , 50 ,
                'C' , 100 ,
                'D' , 500 ,
                'M' , 1000 
            )
        );

        int sum = 0;

        int ptr = 0;
        while(ptr < s.length()){
            
                int currVal =  map.get(s.charAt(ptr));
                if(ptr+1 < s.length()){                  
                    int nextVal = map.get(s.charAt(ptr+1));
                    if(nextVal > currVal){
                        sum+= nextVal - currVal; 
                        ptr+=2;
                        continue;
                    }
                   
                }
                    sum+=currVal;
                    ptr++;
                
        }

        return sum;
    }
}