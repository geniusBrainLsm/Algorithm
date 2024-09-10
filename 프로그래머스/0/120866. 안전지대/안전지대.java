public class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int safeCount = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) { 
                    boolean isSafe = true;
                    
                    
                    for (int[] dir : directions) {
                        int ni = i + dir[0];
                        int nj = j + dir[1];
                        
                    
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                            if (board[ni][nj] == 1) {
                                isSafe = false;
                                break;
                            }
                        }
                    }
                    
                
                    if (isSafe) {
                        safeCount++;
                    }
                }
            }
        }
        
        return safeCount;
    }
}
