import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Integer[] reverseSortedArr = new Integer[emergency.length];
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i = 0; i<emergency.length; i++){
            reverseSortedArr[i] = emergency[i];
        }
        Arrays.sort(reverseSortedArr, Comparator.reverseOrder());
        
        for(int j = 0; j<emergency.length; j++){
            for(int k = 0; k<emergency.length; k++){
                if(emergency[j] == reverseSortedArr[k]){
                    answerList.add(k+1); 
                }
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}