class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<food.length; i++){
            int fd =0 ;
            
            fd = food[i]/2;
            
            for(int j = 1; j<=fd; j++){
                sb.append(i);
            }
            fd = 0;
        }
        String answer = "";
        sb.append("0");
        answer += sb.toString();
        sb.deleteCharAt(sb.toString().length()-1);
        sb.reverse();
        answer += sb.toString();
        return answer;
    }
}