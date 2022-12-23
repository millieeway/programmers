import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        Arrays.sort(array);
        for(int i = 0; i < array.length - 1; i++){
            if(Math.abs(n - array[i]) > Math.abs(n - array[i+1]))
                answer = array[i+1];
        }
        return answer;
    }
}