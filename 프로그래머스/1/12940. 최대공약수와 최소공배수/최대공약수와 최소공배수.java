class Solution {
    public int gcd(int n, int m) {
            int r;
            while(m > 0) {
                r = n % m;
                n = m;
                m = r;
            }
            return n;
        }
    
    public int[] solution(int n, int m) {
        
        if(n<m){
            int temp = m;
            m = n;
            n = temp;
        }
        return new int[] {gcd(n,m), n * m / gcd(n,m)};
    }
}