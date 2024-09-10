import java.util.*;
class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String[] arr = sb.toString().split("");
        
        return Arrays.stream(arr)
                            .mapToInt(ch->Integer.parseInt(ch))
                            .toArray();
    }
}