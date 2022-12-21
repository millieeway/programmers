import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            while(n % i == 0){
                set.add(i);
                n /= i;
            }
        }
        if (n != 1) set.add(n);
        
        int i = 0;
        int[] answer = new int[set.size()];
        Iterator it = set.iterator();
        while(it.hasNext()){
            answer[i] = (int)it.next();
            i++;
        }
        Arrays.sort(answer);
        return answer;
    } 
}