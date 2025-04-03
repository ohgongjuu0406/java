import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "" + n;
        
        for(int i = 0; i<s.length(); i++){
            //문자열 그대로를 숫자로 바꾸는 방법(앞에 int를 붙이면 아스키코드를 반환함)
            answer += Character.getNumericValue(s.charAt(i));
        }
        return answer;
    }
}