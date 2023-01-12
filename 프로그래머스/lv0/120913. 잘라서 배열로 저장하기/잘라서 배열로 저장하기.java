class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int)Math.ceil(my_str.length()/(double)n);
        String[] answer = new String[length];
        int num = 0;
        for(int i = 0; i < answer.length; i++){
            if(num+n >= my_str.length()){
                answer[i] = my_str.substring(num);
            }else{
                answer[i] = my_str.substring(num, num+n);
            }
            num += n;
        }
        return answer;
    }
}