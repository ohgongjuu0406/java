import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        // list에 저장하기 위함
        String[] list = my_string.split("");
        
        Arrays.sort(list);
        
        //다시 string으로 변환하기 위함
        answer = String.join("", list);
        
        return answer;
    }
}