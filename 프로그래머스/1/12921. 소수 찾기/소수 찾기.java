class Solution {
    public int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;  // 처음엔 모두 소수라고 가정
        }
        
        // 에라토스테네스의 체
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;  // i의 배수들은 소수가 아니라고 체크
                }
            }
        }
        
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) answer++;
        }
        
        return answer;
    }
}
