import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // Step 1: Count the number of players stuck on each stage
        Map<Integer, Integer> stageCountMap = new HashMap<>();
        for (int stage : stages) {
            stageCountMap.put(stage, stageCountMap.getOrDefault(stage, 0) + 1);
        }

        // Step 2: Calculate failure rates for each stage
        double[] failureRates = new double[N];
        int totalPlayers = stages.length;

        for (int i = 0; i < N; i++) {
            int stageNumber = i + 1;
            int playersAtStage = stageCountMap.getOrDefault(stageNumber, 0);
            if (totalPlayers > 0) {
                failureRates[i] = (double) playersAtStage / totalPlayers;
            } else {
                failureRates[i] = 0;
            }
            totalPlayers -= playersAtStage;
        }

        // Step 3: Create an array of stage numbers
        Integer[] stageNumbers = new Integer[N];
        for (int i = 0; i < N; i++) {
            stageNumbers[i] = i + 1;
        }

        // Step 4: Sort the stages based on failure rates in descending order
        Arrays.sort(stageNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (failureRates[b - 1] > failureRates[a - 1]) {
                    return 1;
                } else if (failureRates[b - 1] < failureRates[a - 1]) {
                    return -1;
                } else {
                    return a - b; // If failure rates are equal, sort by stage number ascending
                }
            }
        });

        // Step 5: Convert the sorted stageNumbers to int[]
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageNumbers[i];
        }

        return answer;
    }
}
