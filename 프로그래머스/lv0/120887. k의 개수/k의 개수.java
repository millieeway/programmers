class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int z = i; z <= j; z++){
            int num = z;
            while(num != 0){
                if(num % 10 == k){
                    answer ++;
                }
                num /= 10;
            }
        }
        return answer;
    }
}