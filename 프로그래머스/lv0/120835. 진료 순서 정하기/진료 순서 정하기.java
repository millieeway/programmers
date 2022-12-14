import java.util.*;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
       
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int num : emergency){
            list.add(num);
        }
    
        Collections.sort(list, Collections.reverseOrder());
        for(int i = 0; i < emergency.length; i++){
            answer[i] = list.indexOf(emergency[i]) + 1;
        }
        return answer;
    }
}