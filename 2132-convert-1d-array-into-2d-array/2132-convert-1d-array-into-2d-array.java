class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (!(original.length==m*n)) {
            return new int[][] {};
        }
        int[][] res = new int[m][n];
        int x = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (x < original.length) {
                    res[i][j] = original[x];
                    x++;
                }
            }
        }
        return res;
    }
}