import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArr);
       
        return new String(charArr);
    }
}