class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int result[][] = new int[mat.length][mat[0].length];
        for (int i = 0, iLimit = mat.length; i < iLimit; ++i) {
            for (int j = 0, jLimit = mat[i].length; j < jLimit; ++j) {
                if (mat[i][j] == 0) {
                    this.getDistanceWithZero(mat, result,  0, j, i);
                }
            }
        }
        return result;
    }
    
    private void getDistanceWithZero(int[][] mat, int[][] result, int distance, int x, int y) {
        if (x < 0 || y < 0 || x >= mat[0].length || y >= mat.length) {
            return ;
        }
        if (distance == 0 || mat[y][x] == 1 && (result[y][x] == 0 || result[y][x] > distance)) {
            result[y][x] = distance;
            getDistanceWithZero(mat, result, distance + 1, x - 1, y);
            getDistanceWithZero(mat, result, distance + 1, x + 1, y);
            getDistanceWithZero(mat, result, distance + 1, x, y - 1);
            getDistanceWithZero(mat, result, distance + 1, x, y + 1);
        }
    }
}