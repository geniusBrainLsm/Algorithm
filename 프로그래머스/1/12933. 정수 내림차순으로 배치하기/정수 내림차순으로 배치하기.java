import java.util.*;
class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Long[] iarr = new Long[arr.length];
        String[] sarr = new String[arr.length];
        for(int i = 0; i<arr.length;i++){
            iarr[i] = Long.parseLong(arr[i]);
        }
        Arrays.sort(iarr, Comparator.reverseOrder());
        for(int j = 0; j<arr.length; j++){
            sarr[j] = Long.toString(iarr[j]);
        }
        String asd = String.join("", sarr);
        return Long.parseLong(asd);
        
    }
}