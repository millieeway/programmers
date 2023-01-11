class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
           if(Character.isDigit(my_string.charAt(i))){
                String str = "";
                while(Character.isDigit(my_string.charAt(i))){
                    str += my_string.charAt(i);
                    i++;
                    if(i == my_string.length()) break;
                }
            answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}