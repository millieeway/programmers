import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String num = my_string.replaceAll("[^0-9]", "");
        String[] numArr = num.split("");
        int[] answer = new int[numArr.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(numArr[i]);
        }
   
        Arrays.sort(answer);
        return answer;
    }
}