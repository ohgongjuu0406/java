import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<numbers.length;i++){
            for(int j = i+1; j<numbers.length;j++){
                list.add(numbers[i] * numbers[j]);
            }
                
        }
        Collections.sort(list);
        // ArrayList는 길이를 size()로 반환
        answer = list.get(list.size()-1);
        
        
        return answer;
    }
}