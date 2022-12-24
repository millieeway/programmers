class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = String.valueOf(order);
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == 51 || num.charAt(i) == 54 || num.charAt(i) == 57)
                answer++;
        }
        return answer;
    }
}