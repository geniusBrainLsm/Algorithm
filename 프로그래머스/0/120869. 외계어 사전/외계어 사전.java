import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String joinSpell = String.join("", spell);
        
       
        for (String word : dic) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String sortedWord = new String(wordChars);
            
            
            if (joinSpell.equals(sortedWord)) {
                return 1;
            }
        }
        return 2;
    }
}
