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

        int point = 0;
        while(point < s.length()){
            
                
                if(point+1 < s.length() && map.get(s.charAt(point)) < map.get(s.charAt(point+1))){
                   sum+=map.get(s.charAt(point+1)) -map.get(s.charAt(point)); 
                   point+=2;
                }else{
                    sum+=map.get(s.charAt(point));
                    point++;
                }
        }

        return sum;
    }
}