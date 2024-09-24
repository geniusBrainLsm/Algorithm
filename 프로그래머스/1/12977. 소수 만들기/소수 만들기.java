class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int ii = i + 1; ii < nums.length; ii++) {
                for (int iii = ii + 1; iii < nums.length; iii++) {
                    int sum = nums[i] + nums[ii] + nums[iii];
                    
                    if (sum > 1) { 
                        boolean isPrime = true; 
                        for (int iv = 2; iv * iv <= sum; iv++) {
                            if (sum % iv == 0) { 
                                isPrime = false;
                                break; 
                            }
                        }
                      
                        if (isPrime) {
                            answer++;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
