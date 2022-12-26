import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                set.add(i);
                set.add(n/i);
            }
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}