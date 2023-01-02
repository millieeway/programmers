class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String num2 = num + "";
        String k2 = k + "";
        
        if(num2.contains(k2)){
            answer = num2.indexOf(String.valueOf(k2))+1;
        }else{
            answer = -1;
        }
        return answer;
    }
}