import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] a1 = before.toCharArray();
        char[] a2 = after.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)) return 1;
        return 0;
    }
}