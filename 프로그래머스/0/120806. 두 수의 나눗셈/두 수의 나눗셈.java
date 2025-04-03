class Solution {
    public int solution(double num1, double num2) {
        int answer = 0;
        // 소수로 표현하기 위함
        double a;
        a = num1 / num2 * 1000;
        answer = (int) a;
        return answer;
    }
}