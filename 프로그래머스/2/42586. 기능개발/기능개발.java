import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1;
        
        
        for(int i=0; i<progresses.length;i++){
            int result = (100 - progresses[i] + (speeds[i] - 1))/speeds[i];
            list.add(result);
            
        }
        
        
        int day = list.get(0);
        
        for(int i=1; i<list.size()+1;i++){
            if (i==list.size()){
                ans.add(count);
            }
            else if (list.get(i) <= day){
                count++;
            }
            else{
                ans.add(count);
                count = 0;
                day = list.get(i);
                count++;
            }
        }
        answer = new int[ans.size()];
        for(int i=0; i<ans.size();i++){
            answer[i] = ans.get(i);
        }
        return answer;
    
    }
}