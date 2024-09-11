import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int index = 0;
        while(budget>=d[index]){
            budget = budget - d[index++];
            answer++;
            if(index == d.length) break;
        }
        return answer;
    }
}