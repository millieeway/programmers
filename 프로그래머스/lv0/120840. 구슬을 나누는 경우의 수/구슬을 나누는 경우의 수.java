class Solution {
    public int solution(int balls, int share) {
        double balls1 = (double) balls;
        double share1 = (double) share;
        double answer = 1;
        for(int i = 0; i < share1; i++) answer *= (balls1 - i);
        for(int i = 0; i < share1; i++) answer /= (share1 - i);
        return (int)answer;
    }
}