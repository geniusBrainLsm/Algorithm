class Solution {
    public String solution(int a, int b) {
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] yoil = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int alldate = 0;
        
        for(int i = 0; i<a -1; i++){
            alldate += date[i];
        }
        alldate += b- 1;
        alldate = alldate % 7;
        return yoil[alldate];
    }
}