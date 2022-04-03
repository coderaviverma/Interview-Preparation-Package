package company;

import java.util.TreeMap;

class Solution {

    public static void main(String[] args) {
        int capacity = 5;
        int[][] arr={{2,1,5},{3,3,7}};

        System.out.println(carPooling(arr,capacity));
    }

    public static boolean carPooling(int[][] trips, int capacity) {
        
        
        //1 ------- 5 = 2
        //     3----------7 = 3
        

        TreeMap<Integer,Integer> tm= new TreeMap<>();
        
        int lastend=0;
        
        for(int i=0;i<trips.length;i++){
            
            if(trips[i].length>0){
                int pas= trips[i][0];
                int start= trips[i][1];
                int end= trips[i][2];
                
                if(tm.containsKey(start)){
                     tm.put(start,tm.get(start)+pas);
                }else{
                    tm.put(start,pas);
                }
                
                if(tm.containsKey(end)){
                     tm.put(end,tm.get(end)-pas);
                }else{
                    tm.put(end,-pas);
                } 
                
                lastend=Math.max(lastend,end);
                
            }
        }
        
        //1 - 2
        //5 - 3
        //5 - -2
        //7 - -3
        
        int temp=capacity;
        
        for(int i=0;i<=lastend;i++ ){
            
            if(tm.containsKey(i)){
                int te= tm.get(i);//

                temp=temp - te;//0

                if(temp<0){
                    return false;
                }
            }
            
        }
           
        return true;
    }
    
    
}