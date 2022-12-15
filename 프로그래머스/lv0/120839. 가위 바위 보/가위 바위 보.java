import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("0", "5");
        map.put("2", "0");
        map.put("5", "2");
        
        for(String str : arr){
            answer += map.get(str);
        }
        
        return answer;
    }
}