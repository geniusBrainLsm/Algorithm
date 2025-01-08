class Solution {
    public int[] solution(int[] sequence, int k) {
        int sum = 0; 
        int point = 0;
        int minLength = Integer.MAX_VALUE; 
        int[] result = {-1, -1}; 

        for (int i = 0; i < sequence.length; i++) {
            sum += sequence[i]; 

            while (sum >= k) {
                if (sum == k) {
                    int length = i - point + 1;

                    if (length < minLength || 
                        (length == minLength && point < result[0])) {
                        minLength = length;
                        result[0] = point;
                        result[1] = i;
                    }
                }
                sum -= sequence[point];
                point++;
            }
        }
        return result;
    }
}
