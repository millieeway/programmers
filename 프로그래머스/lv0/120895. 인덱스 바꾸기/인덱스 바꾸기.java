class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        char temp = my_string.charAt(num1);
        
        ch[num1] = my_string.charAt(num2);
        ch[num2] = temp;
        
        for(char ch1 : ch){
            answer += ch1;
        }
        return answer;
    }
}