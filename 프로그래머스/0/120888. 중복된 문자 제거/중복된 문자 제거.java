class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] list = my_string.split("");
        for(int i= 0; i<my_string.length(); i++){
            if (! answer.contains(list[i])){
                answer += list[i];
            }
        }
        return answer;
    }
}