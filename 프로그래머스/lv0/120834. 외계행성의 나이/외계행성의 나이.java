class Solution {
    public String solution(int age) {
        String answer = "";
        String age2 = Integer.toString(age);
        for(int i = 0; i < age2.length(); i++){
            answer += (char)(age2.charAt(i) + 49);
        }
        return answer;
    }
}