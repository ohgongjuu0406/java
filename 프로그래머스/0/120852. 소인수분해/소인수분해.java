import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            int sum = 0;
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    sum++;
                    
                }
            }
            if(sum == 2 && n % i == 0){
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}