class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int yLen = image.length - 1;
        int xLen = image[0].length - 1;
        int targetColor = image[sr][sc];
        boolean[][] path = new boolean[yLen + 1][xLen + 1];
        flood(path, image, sc, sr, color, targetColor, xLen, yLen);
        return image;
    }

    public void flood(boolean[][] path, int[][] image, int x, int y, int color, int beforeTargetColor, int xLen, int yLen) {
        if (x < 0) {
            return ;
        }
        if (y < 0) {
            return ;
        }
        if (x > xLen) {
            return ;
        }
        if (y > yLen) {
            return ;
        }
        if (path[y][x]) {
            return ;
        }
        int targetColor = image[y][x];
        if (beforeTargetColor != targetColor) {
            return ;
        }
        image[y][x] = color;
        path[y][x] = true;
        flood(path, image, x - 1, y, color, targetColor, xLen, yLen);
        flood(path, image, x + 1, y, color, targetColor, xLen, yLen);
        flood(path, image, x, y - 1, color, targetColor, xLen, yLen);
        flood(path, image, x, y + 1, color, targetColor, xLen, yLen);
    }
}