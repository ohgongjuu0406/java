import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        for(int i=0; i<array.length; i++){
            if(array[i] > n){
                if(array[i] - n < min){
                    min = array[i] - n;
                    answer = array[i];
                }
                else if(array[i] - n == min){
                    answer = Math.min(array[i],answer);
                }
            }
            else{
                if(n - array[i] < min){
                    min = n - array[i];
                    answer = array[i];
                }
                else if(n - array[i] == min){
                    answer = Math.min(array[i],answer);
                }
            }
        }
        return answer;
    }
}