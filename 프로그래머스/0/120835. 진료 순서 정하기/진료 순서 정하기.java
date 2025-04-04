import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        
        int[] answer = new int[emergency.length];
        //배열 복사
        int[] list =  emergency.clone(); 
        
       
    
        Arrays.sort(list);
        
        
        
        for(int i = 0; i<emergency.length; i++){

            
            for(int j = 0; j<emergency.length; j++){
                if(list[list.length -1 - i] == emergency[j])
                    answer[j] = i + 1;

           
            }
        
            
         
        }
        return answer;
    }
}