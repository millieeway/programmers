class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(String s : str){
            answer += s.repeat(n);
        }
        return answer;
    }
}