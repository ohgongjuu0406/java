class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String c;
        
        for(int i = 0; i < my_string.length(); i++){
            
            // string과 char은 비교가 안되고, equals()는 string에만 쓸 수 있음
            c = String.valueOf(my_string.charAt(i));
        
            if (letter.equals(c))
                continue;
            else
                answer += my_string.charAt(i);
            
        }
        return answer;
    
    }
}