class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String d : dic){
            int count = 0;
            for(String sp : spell){
                if(d.contains(sp)) count++;
            }
            if(count == spell.length) answer = 1;
        }
        return answer;
    }
}