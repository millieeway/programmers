class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        for(int i = 0; i < str.length-1; i++){
            if(str[i].equals("+")){
                answer += Integer.parseInt(str[i+1]);
                i++;
            }else if(str[i].equals("-")){
                answer -= Integer.parseInt(str[i+1]);
                i++;
            }else{
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}