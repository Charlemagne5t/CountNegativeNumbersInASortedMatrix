

public class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int i = 0;
        int newStart = n - 1;
        for (; i < m; i++) {
            for (int j = newStart; j >= 0; j--) {
                if (j == 0 && grid[i][j] < 0) {
                    count += n;
                    newStart = 0;
                }
                if (grid[i][j] >= 0) {
                    count += n - j - 1;
                    newStart = j;
                    break;
                }
            }
        }
        return count;
    }
}
