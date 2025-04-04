import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            int cnt = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == s.charAt(i)){
                    cnt++;
                }
            }
            if (cnt == 1){
                answer+=s.charAt(i);
            }
        }
        
        String[] list = answer.split("");
        
        Arrays.sort(list);
        
        answer = String.join("", list);
        return answer;
    }
}