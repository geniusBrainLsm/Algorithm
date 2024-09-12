class Solution {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        int index = 1;
        for(int i = 0; i<=arr.length; i++){
            arr[i] = (long)x * index;
            if(index == n) break;
            index++;
        }
        return arr;
    }
}