class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int wordIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ' ') {
                sb.append(' ');
                wordIndex = 0;
            } else {
                if (wordIndex % 2 == 0) {
                    sb.append(Character.toUpperCase(currentChar));
                } else {
                    sb.append(Character.toLowerCase(currentChar));
                }
                wordIndex++;
            }
        }

        return sb.toString();
    }
}
