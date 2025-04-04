class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if(num % 2 != 0){
            int x = total/num;
            
            for(int i=0; i<num; i++){
                answer[i] = x - (num / 2) + i; 
            }
            
        }
        
        else{
            int x = total/num ;
            
            for(int i=0; i<num; i++){
                answer[i] = x - ((num / 2) -1) + i; 
            }
        }
        return answer;
    }
}