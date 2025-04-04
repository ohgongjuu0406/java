class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char c = (char) (k +'0');
        
        for(int a = i; a<=j; a++){
            String s1 = a+"";
            
            for(int b=0;b<s1.length(); b++){
                if(s1.charAt(b) == c){
                    answer+=1;
                }
            }
        }
        return answer;
    }
}