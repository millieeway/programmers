import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
       
        char[] charArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        answer = String.valueOf(charArr);
        
        return answer;
    }
}