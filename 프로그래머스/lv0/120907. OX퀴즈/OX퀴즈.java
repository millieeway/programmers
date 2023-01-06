class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            int result = 0;
            String[] num = quiz[i].split(" ");
            result += Integer.parseInt(num[0]);
            for(int j = 1; j < num.length; j++){
                if(num[j].equals("+")){
                    result += Integer.parseInt(num[j+1]);
                    j++;
                }else if(num[j].equals("-")){
                    result -= Integer.parseInt(num[j+1]);
                    j++;
                }else if(num[j].equals("=")){
                    break;
                }
            }
            answer[i] = result == Integer.parseInt(num[4]) ? "O" : "X";
        }
        return answer;
    }
}