class Solution {
    int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int 최소공배수 = denom1 * denom2 / gcd(denom1, denom2);

        int numer = numer1 * (최소공배수 / denom1) + numer2 * (최소공배수 / denom2);
        int denom = 최소공배수;

        int 최대공약수 = gcd(numer, denom);

        int[] answer = new int[2];
        answer[0] = numer / 최대공약수;   
        answer[1] = denom / 최대공약수;   

        return answer;
    }
}
