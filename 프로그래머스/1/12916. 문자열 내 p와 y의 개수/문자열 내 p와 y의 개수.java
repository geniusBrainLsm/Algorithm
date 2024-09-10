class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        boolean answer = true;
        for(int i = 0; i<s.length(); i++){
            if(Character.toString(s.charAt(i)).equals("p") ||Character.toString(s.charAt(i)).equals("P")) {
                p++;
            }
            if(Character.toString(s.charAt(i)).equals("y") ||Character.toString(s.charAt(i)).equals("Y")) {
                y++;
            }
        }
        if(p==y){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}