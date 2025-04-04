class Solution {
    public int solution(int n) {
        int answer = 2;
        int mul = 1;
        while(true){
            for(int i=1; i<=answer; i++){
                mul *= i;
            }
            if(mul>n){
                answer--;
                break;
            }
            answer++;
            mul = 1;
        }
        return answer;
    }
}