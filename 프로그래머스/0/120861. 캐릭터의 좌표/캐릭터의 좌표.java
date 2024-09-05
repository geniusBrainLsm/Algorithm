class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int maxX = board[0] / 2;  
        int maxY = board[1] / 2;  
        int x = 0;  
        int y = 0;  

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                x--;
            } else if (keyinput[i].equals("right")) {
                x++;
            } else if (keyinput[i].equals("up")) {
                y++;
            } else if (keyinput[i].equals("down")) {
                y--;
            }

        
            if (x > maxX) {
                x = maxX;
            } else if (x < -maxX) {
                x = -maxX;
            }

            if (y > maxY) {
                y = maxY;
            } else if (y < -maxY) {
                y = -maxY;
            }
        }

        return new int[] { x, y };  
    }
}
