import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        //소문자 : 97~122, 대문자 : 65 ~90
        
        for(int i=0; i<my_string.length(); i++){
            if((int)my_string.charAt(i)<=90)
                answer += Character.toLowerCase(my_string.charAt(i));
            else if((int)my_string.charAt(i)>=97)
                answer += Character.toUpperCase(my_string.charAt(i));
        }
        return answer;
        
        
    }
}