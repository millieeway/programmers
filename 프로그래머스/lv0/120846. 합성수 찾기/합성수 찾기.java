class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= (int)Math.sqrt(i); j++){
                if(i % j == 0) {
                    if(i / j == j) cnt++;
                    else cnt += 2;
                }
            }
            if(cnt >= 3) answer++;
        }
        return answer;
    }
}