class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String s = num + "";
        char a =(char) (k + '0');
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == a){
                answer = i + 1;
                break;
    
                
            }
                
        }
        return answer;
    }
}