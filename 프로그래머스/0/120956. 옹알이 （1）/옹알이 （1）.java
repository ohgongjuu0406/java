class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] list = {"aya", "ye", "woo", "ma"};
        for(int j =0; j<babbling.length; j++){

            for(int i=0;i<list.length; i++){
                babbling[j] = babbling[j].replace(list[i]," ");
            }
            
            babbling[j] = babbling[j].replace(" ", "");
        
            if(babbling[j].equals("")){
                answer += 1;
            }
        }
            
        
        return answer;
    }
}