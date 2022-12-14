class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer sb = new StringBuffer(my_string);
        String str = sb.toString();
        while(str.contains(letter)){
            str = sb.deleteCharAt(sb.indexOf(letter)).toString();
            if(str.contains(letter) == false) break;
        }
        return str;
    }
}