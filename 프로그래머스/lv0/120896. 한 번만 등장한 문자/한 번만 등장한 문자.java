import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);
        for(String s2 : str) answer += s2;
        
        for(int i = 0; i < str.length-1; i++){
           if(str[i].equals(str[i+1])) {
               answer = answer.replace(str[i], "");
            }
        }
        return answer;
    }
}