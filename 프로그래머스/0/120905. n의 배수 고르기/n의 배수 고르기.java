import java.util.*;
class Solution {
    //동적 배열을 사용하기 위함
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0 ; i<numlist.length;i++){
            if(numlist[i] % n == 0)
                answer.add(numlist[i]);
        }
        return answer;
    }
}