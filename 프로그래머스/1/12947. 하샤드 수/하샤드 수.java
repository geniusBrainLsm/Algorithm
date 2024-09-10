class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String a = Integer.toString(x);
        int sum = 0;
        for(int i = 0; i<a.length(); i++){
            sum += Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        if(x % sum == 0){
            answer = true;
        } 
        return answer;
    }
}