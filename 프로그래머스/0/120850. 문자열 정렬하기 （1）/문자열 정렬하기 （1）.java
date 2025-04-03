import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i) - '0' >= 0 && my_string.charAt(i) - '0' <= 9 )
                answer.add(my_string.charAt(i) - '0');
        }
        
        // ArrayList는 Collections.sort() 이용해야함
        Collections.sort(answer);
        return answer;
    }
}