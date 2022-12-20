class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] voewl = {"a", "e", "i", "o", "u"};
        for(int i = 0; i < voewl.length; i++){
            answer = answer.replace(voewl[i],"");  
        } 
        return answer;
    }
}