import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        for(int i = 0; i < a.length; i++){
           if(b[i] != a[i]){
               answer = 0;
               break;
           }
        }
        return answer;
    }
}