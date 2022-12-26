class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] str = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        
        for(int i = 0; i < str.length; i++){
             numbers = numbers.replace(str[i], num[i]);
        }
        return Long.parseLong(numbers);
    }
}