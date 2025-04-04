import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] values = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        //해시맵
        HashMap<String, String> h1 = new HashMap<String, String>( );
        for(int i=0; i<values.length;i++){
            char c = (char)(97+i);
            String s = Character.toString(c);
            h1.put(values[i], s);
        }
        
        String[] list = letter.split(" ");
        
        for(int i = 0; i< list.length; i++){
            answer += h1.get(list[i]);
            
            
        }
        

        return answer;
        
    }
}