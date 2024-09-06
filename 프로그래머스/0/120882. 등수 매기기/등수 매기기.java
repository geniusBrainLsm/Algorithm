import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        for(int[] t : score){
            list.add(t[0] + t[1]);
        }
        list.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = list.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
    }
}