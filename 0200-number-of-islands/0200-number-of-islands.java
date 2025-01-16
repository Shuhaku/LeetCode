class Solution {
    public int numIslands(char[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int[] dy = new int[]{1, -1, 0, 0};
        int[] dx = new int[]{0, 0, 1, -1};
        boolean[][] visited = new boolean[rowLen][colLen];
        int islandCnt = 0;

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                if (grid[row][col] == '1' && !visited[row][col]) {
                    createIsland(grid, visited, row, col, rowLen, colLen, dy, dx);
                    islandCnt++;
                }
            }
        }

        return islandCnt;
    }

    public static void createIsland(char[][] grid, boolean[][] visited, int row, int col, int rowLen, int colLen, int[] dy, int[] dx) {
        visited[row][col] = true;

        for (int i = 0; i < 4; i++) {
            int ny = row + dy[i];
            int nx = col + dx[i];

            if (ny < 0 || ny >= rowLen || nx < 0 || nx >= colLen) {
                continue;
            }
            if (grid[ny][nx] == '1' && !visited[ny][nx]) {
                createIsland(grid, visited, ny, nx, rowLen, colLen, dy, dx);
            }
        }
    }
}