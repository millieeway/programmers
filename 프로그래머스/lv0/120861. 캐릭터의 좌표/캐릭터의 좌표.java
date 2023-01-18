class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int row = (board[0]-1)/2;
        int col = (board[1]-1)/2;
        for(int i = 0; i < keyinput.length; i++){
            switch(keyinput[i]){
                case "left":
                    answer[0]--;
                    break;
                case "right":
                    answer[0]++;
                    break;
                case "down":
                    answer[1]--;
                    break;
                case "up":
                    answer[1]++;
                    break;
            }
            if(Math.abs(answer[0]) > Math.abs(row)){
                if(answer[0] < 0) {
                    answer[0]++;   
                }else{
                    answer[0]--;
                }
            }
            if(Math.abs(answer[1]) > Math.abs(col)){
                 if(answer[1] < 0) {
                    answer[1]++;   
                }else{
                    answer[1]--;
                }
            }
        }
        return answer;
    }
}