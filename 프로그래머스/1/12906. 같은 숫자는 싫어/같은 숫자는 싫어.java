import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int num:arr){
            if((list.size()) == 0){
                list.add(num);
            }
            else if(list.get(list.size()-1) != num){
                list.add(num);
            }
        }
        
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}