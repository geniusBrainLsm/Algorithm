class Solution {
    public int solution(int[] numbers) {
        String num = "0123456789";
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            num = num.replace(Integer.toString(numbers[i]), "");
        }
        for(int j = 0; j<num.length(); j++){
            sum += Character.getNumericValue(num.charAt(j));
        }
        return sum;
    }
}