class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" +");
        
        int xCoefficient = 0;
        int constant = 0;
        
        for (String term : arr) {
            if (term.equals("+")) continue;
            
            if (term.contains("x")) {
                if (term.equals("x")) {
                    xCoefficient += 1;
                } else {
                    xCoefficient += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                constant += Integer.parseInt(term);
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        if (xCoefficient != 0) {
            if (xCoefficient == 1) {
                result.append("x");
            } else {
                result.append(xCoefficient).append("x");
            }
        }
        
        if (constant != 0) {
            if (result.length() > 0) {
                result.append(" + ");
            }
            result.append(constant);
        }
        
        return result.length() > 0 ? result.toString() : "0";
    }
}