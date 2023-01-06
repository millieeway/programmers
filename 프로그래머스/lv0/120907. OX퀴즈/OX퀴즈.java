class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            int result = 0;
            String[] num = quiz[i].split(" ");
            result += Integer.parseInt(num[0]);
            if(num[1].equals("+")){
                result += Integer.parseInt(num[2]);
            }else {
                result -= Integer.parseInt(num[2]);
            }
            answer[i] = result == Integer.parseInt(num[4]) ? "O" : "X";
        }
        return answer;
    }
}