import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        //정렬해서 일치하면 1, 불일치 0
        String[] a = before.split("");
        String[] b = after.split("");
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i = 0; i<a.length; i++){
            if(!a[i].equals(b[i])){
                answer = 0;
                break;
            }
        }
        
        
        
        
        return answer;
    }
}