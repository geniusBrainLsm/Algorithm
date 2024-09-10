class Solution {
    public long solution(long n) {
        Long sqrt = (long) Math.sqrt(n);
        
        if(sqrt * sqrt == n){
            return (sqrt+1) * (sqrt+1); 
        }
        return -1;
    }
}