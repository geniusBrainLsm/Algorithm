class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while(chicken>9){
            chicken = chicken-10;
            chicken++;
            answer++;
        }
        return answer;
    }
}