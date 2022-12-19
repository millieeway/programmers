class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
           answer[0] = numbers[numbers.length-1];
           for(int i = numbers.length-1; i > 0; i--){
               answer[i] = numbers[i-1];
           }
        }else{
            answer[numbers.length-1] = numbers[0];
            for(int i = 0; i < numbers.length-1; i++){
               answer[i] = numbers[i+1];
           }
        }
        return answer;
    }
}