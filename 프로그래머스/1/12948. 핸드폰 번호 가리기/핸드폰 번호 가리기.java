class Solution {
    public String solution(String phone_number) {
        int newLeng = 0;
        for(int i = 0; i<phone_number.length(); i++){
            if(phone_number.length() - i == 4){
                newLeng = i;
            }
            
        }
        StringBuilder sb = new StringBuilder(phone_number);
        
        for(int i = 0; i<newLeng; i++){
            sb.setCharAt(i, '*');
        }
        return sb.toString();
    }
}