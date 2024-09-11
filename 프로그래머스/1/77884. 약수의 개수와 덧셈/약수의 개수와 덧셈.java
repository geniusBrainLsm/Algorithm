class Solution {
    public int solution(int left, int right) {
        int y = 0;
        int answer = 0;
        for(int i = left; i<=right; i++){
            for(int j = 1; j<=i; j++){
                if(i % j == 0){
                    y++;
                }
            }
            if(y%2==0){
                answer += i;
            } else{
                answer -= i;
            }
            y = 0;
        }
        return answer;
    }
}