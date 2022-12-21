import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<String> list = new ArrayList<String>();
        for(String str : my_string.split("")){
            if(!list.contains(str)){
                list.add(str);
                answer += str;
            }else{
                continue;
            }
        }
        return answer;
    }
}