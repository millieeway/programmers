class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        int value = 1;
        while(true){
            i++;
            value *= i;
            if (value > n) {
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
}